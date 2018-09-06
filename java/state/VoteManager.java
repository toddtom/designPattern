package state;

import state.service.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 投票管理，上下文
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class VoteManager {
  //持有状态处理对象
  private VoteState state=null;
  //记录用户投票结果，Map<String,String>对应Map<用户名称，投票的选项>
  private Map<String,String> mapVote=new HashMap<>();
  //记录用户投票次数，Map<String,Integer>对应Map<用户名称，投票次数>
  private Map<String,Integer> mapVoteCount=new HashMap<>();

  public Map<String, String> getMapVote() {
    return mapVote;
  }
  /**
   * 投票
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void vote(String user,String voteItem){
    //1.先为该用户增加投票次数，从记录中取出投票次数
    Integer oldVoteCount=mapVoteCount.get(user);
    if(null==oldVoteCount){
      oldVoteCount=0;
    }
    oldVoteCount=oldVoteCount+1;
    mapVoteCount.put(user,oldVoteCount);
    //2.判断该用户投票类型，就相当于判断对应的状态，到底是正常投票，重复投票，恶意投票还是黑名单状态
    if(oldVoteCount==1){
      state=new NormalVoteState();
    }else if(oldVoteCount>1 && oldVoteCount<5){
      state=new RepeatVoteState();
    }else if(oldVoteCount>=5 && oldVoteCount<8){
      state=new SpiteVoteState();
    }else{
      state=new BlackVoteState();
    }
    state.vote(user,voteItem,this);
  }
}

package state.service;

import state.VoteManager;

/**
 * 恶意投票状态
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class SpiteVoteState implements VoteState {
  public void vote(String user, String voteItem, VoteManager voteManager){
    //恶意投票，取消用户的投票资格，并取消投票记录
    String s=voteManager.getMapVote().get(user);
    if(s!=null){
      voteManager.getMapVote().remove(user);
    }
    System.out.println("你有恶意投票行为，取消投票资格");
  }
}

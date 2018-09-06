package state.service;

import state.VoteManager;

/**
 * 正常投票状态
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class NormalVoteState implements VoteState {
  public void vote(String user, String voteItem, VoteManager voteManager){
    //正常投票，记录到投票记录中
    voteManager.getMapVote().put(user,voteItem);
    System.out.println("恭喜你投票成功");
  }
}

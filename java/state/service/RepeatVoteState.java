package state.service;

import state.VoteManager;

/**
 * 重复投票状态
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class RepeatVoteState implements VoteState {
  public void vote(String user, String voteItem, VoteManager voteManager){
    //重复投票，暂时不做处理
    System.out.println("请不要重复投票");
  }
}

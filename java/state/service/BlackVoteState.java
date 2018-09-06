package state.service;

import state.VoteManager;

/**
 * 黑名单状态
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class BlackVoteState implements VoteState {
  public void vote(String user, String voteItem, VoteManager voteManager){
    //黑名单，计入黑名单中，禁止登陆系统
    System.out.println("进入黑名单中，将禁止登陆和使用本系统");
  }


}

package state;

/**
 * 状态模式客户端
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Client {
  public static void main(String[] args) {
    VoteManager vm=new VoteManager();
    for(int i=0;i<8;i++){
      vm.vote("u1","A");
    }
  }
}

package Bridge.service;

/**
 * 以E-mail的方式发送消息
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class MessageEmial implements MessageImplementor{
  public void send(String message,String toUser){
    System.out.println("使用E-mail的方式，发送消息'"+message+"'给"+toUser);
  }
}

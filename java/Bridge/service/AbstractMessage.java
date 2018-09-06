package Bridge.service;

/**
 * 抽象的消息对象
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class AbstractMessage {
  //持有一个实现部分的对象
  protected MessageImplementor impl;

  public AbstractMessage(MessageImplementor impl) {
    this.impl = impl;
  }

  /**
   * 发送消息，转调实现部分的方法
   * @param: message 要发送的消息内容
   * @param: toUser 消息发送的目的人员
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void sendMessage(String message,String toUser){
    this.impl.send(message,toUser);
  }
}

package Bridge.service;

/**
 * 实现发送消息的统一接口
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface MessageImplementor {
  /**
   * 发送消息
   * @param: message 要发送的消息内容
   * @param: toUser 消息发送的目的人员
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  void send(String message,String toUser);
}

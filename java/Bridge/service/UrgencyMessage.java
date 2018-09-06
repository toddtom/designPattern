package Bridge.service;

/**
 * 加急消息处理
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class UrgencyMessage extends AbstractMessage {
  public UrgencyMessage(MessageImplementor impl){
    super(impl);
  }
  @Override
  public void sendMessage(String message,String toUser){
    message="加急："+message;
    super.sendMessage(message, toUser);
  }
  /**
   * 扩展自己的新功能：监控某消息的处理过程
   * @param: messageId 被监控的消息编号
   * @return: 包含监控到的数据对象
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public Object watch(String messageId){
    //获取相应的数据，组织成监控的数据对象，然后返回
    return null;
  }
}

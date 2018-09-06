package observer.service;

/**
 * 观察者，比如报纸的读者
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface Observer {
  /**
   * 被通知的方法
   * @param: subject 具体的目标对象，可以获取报纸的内容
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  void update(Subject subject);
}

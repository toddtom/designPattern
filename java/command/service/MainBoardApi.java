package command.service;
/**
 * 真正执行命令或请求的对象（主板）
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface MainBoardApi {
  /**
   * 主板具有能开机的功能
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  void open();
  /**
   * 主板具有实现重启的功能
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  void reset();
}

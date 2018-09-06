package command.service;

/**
 * 命令接口，声明执行的操作
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface Command {
  /**
   * 执行命令对应的操作
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  void execute();
}

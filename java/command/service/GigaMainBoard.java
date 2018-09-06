package command.service;
/**
 * 技嘉主板类，开机命令的真正实现者，在command模式中充当receiver
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class GigaMainBoard implements MainBoardApi {
  /**
   * 真正的开机命令的实现
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void open(){
    System.out.println("技嘉主板现在正在开机，请稍候");
    System.out.println("接通电源。。。");
    System.out.println("设备检查。。。");
    System.out.println("装载系统。。。");
    System.out.println("机器正常运转起来。。。");
    System.out.println("机器已经正常打开，请操作。。。");
  }

  public void reset(){
    System.out.println("技嘉主板现在正在重启机器，请稍候");
    System.out.println("机器已经正常打开，请操作");
  }
}

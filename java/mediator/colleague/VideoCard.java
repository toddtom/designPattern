package mediator.colleague;

import mediator.service.Mediator;
/**
 *显卡类，一个同事类
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class VideoCard extends Colleague {
  public VideoCard(Mediator mediator){
    super(mediator);
  }
  /**
   * 显示视频数据
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void showData(String data){
    System.out.println("您正观看的是："+data);
  }
}

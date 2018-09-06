package mediator.colleague;

import mediator.service.Mediator;

/**
 * 光驱类，一个同事类
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class CDDriver extends Colleague {
  public  CDDriver(Mediator mediator){
    super(mediator);
  }
  //光驱读出来的数据
  private String data="";

  public String getData() {
    return data;
  }
  /**
   *读取光盘
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void readCD(){
    //逗号前面是视频数据，逗号后面是声音数据
    this.data="设计模式,值得好好研究";
    //通知主板，自己的状态发生了变化
    this.getMediator().changed(this);
  }
}

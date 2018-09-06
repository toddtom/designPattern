package mediator.colleague;

import mediator.service.Mediator;

/**
 * 声卡类，一个同事类
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class SoundCard extends Colleague {
  public SoundCard(Mediator mediator){
    super(mediator);
  }
  /**
   * 按照音频数据发出声音
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void soundData(String data){
    System.out.println("画外音："+data);
  }
}

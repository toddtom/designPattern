package mediator.colleague;

import mediator.service.Mediator;

/**
 * CPU类，一个同事类
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class CPU extends Colleague {
  public CPU(Mediator mediator){
    super(mediator);
  }
  //分解出来的视频数据
  private String videoData="";
  //分解出来的音频数据
  private String soundData="";

  public String getVideoData() {
    return videoData;
  }

  public String getSoundData() {
    return soundData;
  }
  //处理数据，把数据分成音频和视频数据
  public void executeData(String data){
    String[] ss=data.split(",");
    this.videoData=ss[0];
    this.soundData=ss[1];
    //通知主板，CPU的工作完成
    this.getMediator().changed(this);
  }
}

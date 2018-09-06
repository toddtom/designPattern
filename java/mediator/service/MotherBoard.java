package mediator.service;

import mediator.colleague.*;

/**
 * 主板类，实现中介者接口
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class MotherBoard implements Mediator {
  //需要知道的交互类
  private CDDriver cdDriver=null;
  private CPU cpu=null;
  private VideoCard videoCard=null;
  private SoundCard soundCard=null;

  public void setCdDriver(CDDriver cdDriver) {
    this.cdDriver = cdDriver;
  }

  public void setCpu(CPU cpu) {
    this.cpu = cpu;
  }

  public void setVideoCard(VideoCard videoCard) {
    this.videoCard = videoCard;
  }

  public void setSoundCard(SoundCard soundCard) {
    this.soundCard = soundCard;
  }
  public void changed(Colleague colleague){
    if(colleague==cdDriver){
      this.opeCDDriverReadData((CDDriver) colleague);
    }else if(colleague==cpu){
      this.opeCPU((CPU)colleague);
    }
  }
  /**
   * 处理光驱读取数据以后与其他对象的交互
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  private void opeCDDriverReadData(CDDriver cd){
    //先获取光驱读取的数据
    String data=cd.getData();
    //把这些数据传递给cpu进行处理
    this.cpu.executeData(data);
  }
  private void opeCPU(CPU cpu){
    //先获取cpu处理后的数据
    String videoData=cpu.getVideoData();
    String soundData=cpu.getSoundData();
    //把这些数据传递给声卡和显卡展示出来
    this.videoCard.showData(videoData);
    this.soundCard.soundData(soundData);
  }
}

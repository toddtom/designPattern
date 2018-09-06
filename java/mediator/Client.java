package mediator;

import mediator.colleague.CDDriver;
import mediator.colleague.CPU;
import mediator.colleague.SoundCard;
import mediator.colleague.VideoCard;
import mediator.service.MotherBoard;
/**
 * 中介者模式客户端
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Client {
  public static void main(String[] args) {
    MotherBoard mediator=new MotherBoard();
    CDDriver cd=new CDDriver(mediator);
    CPU cpu=new CPU(mediator);
    VideoCard vc=new VideoCard(mediator);
    SoundCard sc=new SoundCard(mediator);
    mediator.setCdDriver(cd);
    mediator.setCpu(cpu);
    mediator.setSoundCard(sc);
    mediator.setVideoCard(vc);
    cd.readCD();
  }
}

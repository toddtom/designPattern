package abstractFactory.service;
/**
 * 具体产品类
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class InterCPUServiceImpl implements CPUService {
  //CPU的针脚数
  private int pins=0;

  public InterCPUServiceImpl(int pins) {
    this.pins = pins;
  }

  public void calculate(){
    System.out.println("now in Inter CPU,pins="+pins);
  }
}

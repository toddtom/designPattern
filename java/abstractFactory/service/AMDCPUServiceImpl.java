package abstractFactory.service;
/**
 * 具体产品类
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class AMDCPUServiceImpl implements CPUService {
  private int pins=0;

  public AMDCPUServiceImpl(int pins) {
    this.pins = pins;
  }
  public void calculate(){
    System.out.println("now in AMD CPU,pins="+pins);
  }
}

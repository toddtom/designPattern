package abstractFactory.factory;

import abstractFactory.service.CPUService;
import abstractFactory.service.GAMainboardServiceImpl;
import abstractFactory.service.InterCPUServiceImpl;
import abstractFactory.service.MainboardService;
/**
 * 具体工厂类，定义一套产品实现方案
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Schemal implements AbstractFactory {
  public CPUService createCPUService(){
    return new InterCPUServiceImpl(1156);
  }
  public MainboardService createMainboardService(){
    return new GAMainboardServiceImpl(1156);
  }
}

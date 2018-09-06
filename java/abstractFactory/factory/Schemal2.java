package abstractFactory.factory;

import abstractFactory.service.*;
/**
 * 具体工厂类，定义一套产品实现方案
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Schemal2 implements AbstractFactory {
  public CPUService createCPUService(){
    return new AMDCPUServiceImpl(939);
  }
  public MainboardService createMainboardService(){
    return new MSIMainboardServiceImpl(939);
  }
}

package abstractFactory.factory;

import abstractFactory.service.CPUService;
import abstractFactory.service.MainboardService;
/**
 * 抽象工厂类
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface AbstractFactory {
  CPUService createCPUService();
  MainboardService createMainboardService();
}

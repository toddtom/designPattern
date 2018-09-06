package factoryMethod.factory;

import factoryMethod.service.ExportDBServiceImpl;
import factoryMethod.service.ExportFileService;
/**
 * 具体的工厂方法
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class ExportDBCreator extends ExportCreator{
  @Override
  protected ExportFileService factoryMethod(){
    return new ExportDBServiceImpl();
  }
}

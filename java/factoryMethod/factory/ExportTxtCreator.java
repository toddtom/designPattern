package factoryMethod.factory;

import factoryMethod.service.ExportFileService;
import factoryMethod.service.ExportTxtServiceImpl;
/**
 * 具体的工厂方法
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class ExportTxtCreator extends ExportCreator {
  @Override
  protected ExportFileService factoryMethod(){
    return new ExportTxtServiceImpl();
  }
}

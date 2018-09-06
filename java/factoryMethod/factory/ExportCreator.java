package factoryMethod.factory;

import factoryMethod.service.ExportFileService;
/**
 * 工厂方法抽象类
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public abstract class ExportCreator {
  public boolean export(String data){
    ExportFileService service=factoryMethod();
    return service.export(data);
  }
  //工厂方法
  protected abstract ExportFileService factoryMethod();
}

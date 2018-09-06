package factoryMethod;

import factoryMethod.factory.ExportCreator;
import factoryMethod.factory.ExportDBCreator;
/**
 * 工厂方法模式客户端
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Client {
  public static void main(String[] args) {
    ExportCreator operator=new ExportDBCreator();
    operator.export("测试数据");
  }
}

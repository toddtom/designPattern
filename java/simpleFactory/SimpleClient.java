package simpleFactory;

/**
 * 简单工厂模式
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class SimpleClient {
  public static void main(String[] args) {
    SimpleService service= SimpleFactory.createService();
    service.operation("简单工厂");
  }
}

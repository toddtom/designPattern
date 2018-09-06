package abstractFactory;

import abstractFactory.factory.AbstractFactory;
import abstractFactory.factory.Schemal;
/**
 * 抽象工厂客户端
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Client {
  public static void main(String[] args) {
    ComputerEngineer engineer=new ComputerEngineer();
    AbstractFactory schema=new Schemal();
    engineer.makeComputer(schema);
  }
}

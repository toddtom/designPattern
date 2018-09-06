package Decorator.server;

import java.util.Date;

/**
 * 基本的实现计算奖金的类，也是被装饰器装饰的对象
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class ConcreteComponent extends Component {
  @Override
  public double calcPrize(String user, Date begin, Date end){
    //默认没有奖金
    return 0;
  }
}

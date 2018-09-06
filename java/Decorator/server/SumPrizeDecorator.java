package Decorator.server;

import java.util.Date;

/**
 * 装饰器对象，计算累计奖金
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class SumPrizeDecorator extends Decorator {
  public SumPrizeDecorator(Component c){
    super(c);
  }
  @Override
  public double calcPrize(String user, Date begin, Date end){
    //1.先获取前面运算出来的奖金
    double money=super.calcPrize(user,begin,end);
    //2.然后计算累计奖金，这里假设大家的累计业务额都是1000000
    double prize=1000000*0.001;
    System.out.println(user+"累计奖金"+prize);
    return money+prize;
  }
}

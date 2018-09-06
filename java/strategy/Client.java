package strategy;

import strategy.service.LargeCustomerStrategy;
import strategy.service.Price;
import strategy.service.Strategy;

/**
 * 策略模式客户端
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Client {
  public static void main(String[] args) {
    //选择并创建需要使用的策略对象
    Strategy strategy=new LargeCustomerStrategy();
    //创建上下文
    Price ctx=new Price(strategy);
    //计算报价
    double qoute=ctx.quote(1000);
    System.out.println("向客户报价："+qoute);
  }
}

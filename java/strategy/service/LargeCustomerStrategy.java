package strategy.service;

/**
 * 具体算法实现，为大客户计算应报的价格
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class LargeCustomerStrategy implements Strategy {
  public double calcPrice(double goodsPrice){
    System.out.println("对于大客户，统一折扣10%");
    return goodsPrice*(1-0.1);
  }
}

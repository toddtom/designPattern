package strategy.service;

/**
 * 具体算法实现，为老客户计算应报的价格
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class OldCustomerStrategy implements Strategy {
  public double calcPrice(double goodsPrice){
    System.out.println("对于老客户，统一折扣5%");
    return goodsPrice*(1-0.05);
  }

}

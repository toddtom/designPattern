package strategy.service;
/**
 * 策略，定义计算报价算法的接口
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface Strategy {
  /**
   * 计算应报的价格
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  double calcPrice(double goodsPrice);
}

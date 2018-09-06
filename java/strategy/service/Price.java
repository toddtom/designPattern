package strategy.service;

/**
 * 价格管理,主要完成计算向客户所报价格的功能（上下文）
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Price {
  private Strategy strategy=null;

  public Price(Strategy strategy) {
    this.strategy = strategy;
  }
  public double quote(double goodsPrice){
    return this.strategy.calcPrice(goodsPrice);
  }
}

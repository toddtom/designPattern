package prototype.service;

/**
 * 订单接口
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface OrderService {
  int getOrderProductNum();
  void setOrderProductNum(int num);
  OrderService cloneOrder();
}

package prototype;

import prototype.service.OrderService;

/**
 * 订单处理类，用于对原型进行处理，不需要知道具体的传入对象是哪一种订单类型
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class OrderBusiness {
  public void saveOrder(OrderService order){
    while (order.getOrderProductNum()>1000){
      OrderService newOrder=order.cloneOrder();
      newOrder.setOrderProductNum(1000);
      order.setOrderProductNum(order.getOrderProductNum()-1000);
      System.out.println("拆分生成订单=="+newOrder);
    }
    System.out.println("订单=="+order);
  }
}

package prototype;

import prototype.service.PersonalOrder;

/**
 * 原型模式客户端
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Client {
  public static void main(String[] args) {
    PersonalOrder op=new PersonalOrder();
    op.setProductId("P0001");
    op.setCustomerName("张三");
    op.setOrderProductNum(2925);
    OrderBusiness ob=new OrderBusiness();
    ob.saveOrder(op);
  }
}

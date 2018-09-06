package prototype.service;

/**
 * 具体的订单类，通过clone创建一个新的订单，将原订单的属性拷贝
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class PersonalOrder implements OrderService {
  private String customerName;
  private String productId;
  private int orderProductNum=0;
  public int getOrderProductNum(){
    return this.orderProductNum;
  }
  public void setOrderProductNum(int num){
    this.orderProductNum=num;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  @Override
  public String toString() {
    return "PersonalOrder{" +
        "customerName='" + customerName + '\'' +
        ", productId='" + productId + '\'' +
        ", orderProductNum=" + orderProductNum +
        '}';
  }
  public OrderService cloneOrder(){
    //创建一个新订单，然后把本实例的数据传递过去
    PersonalOrder order=new PersonalOrder();
    order.setCustomerName(this.customerName);
    order.setOrderProductNum(this.orderProductNum);
    order.setProductId(this.productId);
    return order;
  }
}

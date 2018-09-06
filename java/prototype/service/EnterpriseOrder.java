package prototype.service;

public class EnterpriseOrder implements OrderService {
  private String enterpriseName;
  private String productId;
  private int orderProductNum=0;
  public int getOrderProductNum(){
    return this.orderProductNum;
  }
  public void setOrderProductNum(int num){
    this.orderProductNum=num;
  }

  public String getEnterpriseName() {
    return enterpriseName;
  }

  public void setEnterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  @Override
  public String toString() {
    return "EnterpriseOrder{" +
        "enterpriseName='" + enterpriseName + '\'' +
        ", productId='" + productId + '\'' +
        ", orderProductNum=" + orderProductNum +
        '}';
  }
  public OrderService cloneOrder(){
    EnterpriseOrder order=new EnterpriseOrder();
    order.setEnterpriseName(this.enterpriseName);
    order.setOrderProductNum(this.orderProductNum);
    order.setProductId(this.productId);
    return order;
  }
}

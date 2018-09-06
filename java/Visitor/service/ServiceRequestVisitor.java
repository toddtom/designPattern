package Visitor.service;

/**
 * 具体的访问者，实现客户端提出服务请求的功能
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class ServiceRequestVisitor implements Visitor {
  public void visitEnterpriseCustomer(EnterpriseCustomer ec){
    //企业客户提出的具体服务请求
    System.out.println(ec.getName()+"企业提出服务请求");
  }
  public void visitPersonalCustomer(PersonalCustomer pc){
    //个人客户提出的具体服务请求
    System.out.println("客户"+pc.getName()+"提出服务请求");
  }
}

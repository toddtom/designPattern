package Visitor.service;

public interface Visitor {
  /**
   * 访问企业客户，相当于给企业客户端添加访问者的功能
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  void visitEnterpriseCustomer(EnterpriseCustomer ec);
  /**
   * 访问个人客户，相当于给个人客户添加访问者的功能
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  void visitPersonalCustomer(PersonalCustomer pc);
}

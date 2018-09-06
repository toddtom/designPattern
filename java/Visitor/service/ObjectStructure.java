package Visitor.service;

import java.util.ArrayList;
import java.util.Collection;

public class ObjectStructure {
  //要操作的客户集合
  private Collection<Customer> col=new ArrayList<>();
  /**
   * 提供给客户端操作的高层接口，具体的功能由客户端传入的访问者决定
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void handleRequest(Visitor visitor){
    //循环对象结构中的元素，接受访问
    for(Customer cm:col){
      cm.accept(visitor);
    }
  }
  /**
   * 组件对象结构，向对象结构中添加元素,不同的对象结构持有不同的构建方式
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void addElement(Customer ele){
    this.col.add(ele);
  }
}

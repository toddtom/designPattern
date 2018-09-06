package Iterator.service;

import Iterator.model.PayModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户方已有的工资管理对象
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class PayManager extends Aggregate {
  //聚合对象，这里是java的集合对象
  private List list=new ArrayList();

  public List getList() {
    return list;
  }

  @Override
  public Iterator createIterator() {
    return new CollectionIteratorImpl(this);
  }
  public Object get(int index){
    Object retObj=null;
    if(index<this.list.size()){
      retObj=this.list.get(index);
    }
    return retObj;
  }
  public int size(){
    return this.list.size();
  }

  //计算工资
  public void calcPay(){
    PayModel pm1=new PayModel();
    pm1.setPay(3800);
    pm1.setUserName("张三");
    PayModel pm2=new PayModel();
    pm2.setPay(5800);
    pm2.setUserName("李四");
    list.add(pm1);
    list.add(pm2);
  }
}

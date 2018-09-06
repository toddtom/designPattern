package Iterator.service;

import Iterator.model.PayModel;

/**
 * 被客户方收购的公司的工资管理类
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class SalaryManager extends Aggregate {
  //用数组管理
  private PayModel[] pms=null;

  public PayModel[] getPms() {
    return pms;
  }

  @Override
  public Iterator createIterator() {
    return new ArrayIteratorImpl(this);
  }
  public Object get(int index){
    Object retObj=null;
    if(index<pms.length){
      retObj=pms[index];
    }
    return retObj;
  }
  public int size(){
    return this.pms.length;
  }

  /**
   * 计算工资
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void calcSalary(){
    PayModel pm1=new PayModel();
    pm1.setUserName("王五");
    pm1.setPay(2200);
    PayModel pm2=new PayModel();
    pm2.setUserName("赵六");
    pm2.setPay(3600);
    pms=new PayModel[2];
    pms[0]=pm1;
    pms[1]=pm2;

  }
}

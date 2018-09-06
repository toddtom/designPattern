package Iterator;

import Iterator.service.Iterator;
import Iterator.service.PayManager;
import Iterator.service.SalaryManager;

/**
 * 迭代器模式客户端
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Client {
  public static void main(String[] args) {
    PayManager payManager=new PayManager();
    payManager.calcPay();
    System.out.println("集团工资列表：");
    test(payManager.createIterator());
    SalaryManager salaryManager=new SalaryManager();
    salaryManager.calcSalary();
    System.out.println("新收购的公司工资列表：");
    test(salaryManager.createIterator());
  }


  private static void test(Iterator it){
    it.first();
    while (!it.isDone()){
      Object obj=it.currentItem();
      System.out.println("this obj="+obj);
      it.next();
    }
  }
}

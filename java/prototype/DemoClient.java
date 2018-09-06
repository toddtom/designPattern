package prototype;

import prototype.demoservice.ConcretePrototype1;
import prototype.demoservice.ConcretePrototype2;
import prototype.demoservice.Prototype;
import prototype.demoservice.PrototypeManager;

public class DemoClient {
  public static void main(String[] args) {
      try {
        Prototype p1=new ConcretePrototype1();
        PrototypeManager.setPrototype("prototype1",p1);
        Prototype p3=PrototypeManager.getPrototype("prototype1").clone();
        p3.setName("张三");
        System.out.println("第一个实例："+p3);
        //有人动态的切换了实现
        Prototype p2=new ConcretePrototype2();
        PrototypeManager.setPrototype("prototype1",p2);
        //重新获取原型来创建对象
        Prototype p4=PrototypeManager.getPrototype("prototype1").clone();
        p4.setName("李四");
        System.out.println("第二个实例："+p4);
        //有人注销了这个实例
        PrototypeManager.removePrototype("prototype1");
        //再次获取原型来创建对象
        Prototype p5=PrototypeManager.getPrototype("prototype1").clone();
        p5.setName("王五");
        System.out.println("第三个实例："+p5);
      }catch (Exception e){
        e.printStackTrace();
      }
  }
}

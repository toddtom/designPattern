package facade;

import facade.servcie.*;

public class Facade {
  public void test(){
    AService a=new AServiceImpl();
    BService b=new BServiceImpl();
    CService c=new CServiceImpl();
    a.testA();
    b.testB();
    c.testC();
  }
}

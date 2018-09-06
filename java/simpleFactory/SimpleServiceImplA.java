package simpleFactory;

public class SimpleServiceImplA implements SimpleService {
  public void operation(String s){
    System.out.println("SimpleServiceImplA=="+s);
  }
}

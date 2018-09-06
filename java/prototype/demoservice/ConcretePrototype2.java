package prototype.demoservice;
/**
 * 原型2
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class ConcretePrototype2 implements  Prototype {
  private String name;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }
  public Prototype clone(){
    ConcretePrototype2 prototype=new ConcretePrototype2();
    prototype.setName(this.name);
    return prototype;
  }

  @Override
  public String toString() {
    return "ConcretePrototype2{" +
        "name='" + name + '\'' +
        '}';
  }
}

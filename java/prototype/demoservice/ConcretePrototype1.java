package prototype.demoservice;

/**
 * 原型实现1
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class ConcretePrototype1 implements  Prototype {
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
    ConcretePrototype1 prototype=new ConcretePrototype1();
    prototype.setName(this.name);
    return prototype;
  }

  @Override
  public String toString() {
    return "ConcretePrototype1{" +
        "name='" + name + '\'' +
        '}';
  }
}

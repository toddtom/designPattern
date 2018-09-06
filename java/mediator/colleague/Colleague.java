package mediator.colleague;

import mediator.service.Mediator;

/**
 * 同事类的抽象父类
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public abstract class Colleague {
  //持有中介者对象，每一个同事类都知道他的中介者对象
  private Mediator mediator;
  /**
   * 构造方法，传入中介者对象
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public Colleague(Mediator mediator){
    this.mediator=mediator;
  }

  /**
   *获取当前同事类对应的中介者对象
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public Mediator getMediator() {
    return mediator;
  }
}

package mediator.service;

import mediator.colleague.Colleague;

/**
 * 中介者对象接口
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface Mediator {
  /*
  同事对象在自身改变的时候来通知中介者的方法，让中介者去负责相应
  的与其他同事对象的交互
   */
  public void changed(Colleague colleague);
}

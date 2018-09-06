package observer.service;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，作为被观察者
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Subject {
  //用于保存注册的观察者对象，也就是报纸的订阅者
  private List<Observer> readers=new ArrayList<>();
  /**
   * 报纸的读者需要向报社订阅，先要注册
   *
   * @param: reader 报纸的读者
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void attach(Observer reader){
    readers.add(reader);
  }
  /**
   * 报纸的读者可以取消订阅
   * @param: reader 报纸的读者
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void detach(Observer reader){
    readers.remove(reader);
  }
  /**
   * 当每期报纸印刷出来后，就要迅速的被送到读者的手中，相当于通知读者，让他们知道
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  protected void notifyObservers(){
    for(Observer reader:readers){
      reader.update(this);
    }
  }
}

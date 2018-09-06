package prototype.demoservice;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器，用于管理原型，各方法加上synchronized是为了防止多线程访问的并发异常
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class PrototypeManager {

  //用于记录原型的编号和原型实例的对应关系
  private static Map<String,Prototype> map=new HashMap<>();
  //私有化构造函数，避免外部创建实例
  private PrototypeManager(){

  }
  /**
   * 向原型管理器里面添加或者修改某个原型注册,
   * @param: prototypeId 原型编号
   * @param: prototype 原型实例
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public synchronized static void setPrototype(String prototypeId,Prototype prototype){
    map.put(prototypeId,prototype);
  }
  /**
   * 从原型管理器里面删除某个原型注册
   * @param: prototypeId 原型编号
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public synchronized static void removePrototype(String prototypeId){
    map.remove(prototypeId);
  }
  public synchronized static Prototype getPrototype(String prototypeId) throws Exception{
    Prototype prototype=map.get(prototypeId);
    if(null==prototype){
      throw new Exception("您希望获取的原型还没有注册或已经注销");
    }
    return prototype;
  }
}

package Flyweight.service;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂，通常实现为单例
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class FlyweightFactory {
  private static FlyweightFactory factory=new FlyweightFactory();
  private FlyweightFactory(){}
  public static FlyweightFactory getInstance(){
    return factory;
  }
  //缓存多个Flyweight对象
  private Map<String,Flyweight> fsMap=new HashMap<>();
  public Flyweight getFlyweight(String key){
    Flyweight f=fsMap.get(key);
    if(null==f){
      f=new AuthorizationFlyWeight(key);
      fsMap.put(key,f);
    }
    return f;
  }
}

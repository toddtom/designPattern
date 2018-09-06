package singleton;

/**
 * 懒汉式实现单例模式,当使用到实例的时候才会创建
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class SingletonOne {
  //定义一个变量来存储创建好的类实例
  private volatile static SingletonOne uniqueInstance=null;
  //私有化构造方法，在内部控制创建实例的数量
  private SingletonOne() {
  }
  //创建实例的方法，如果有，直接使用，没有则创建(双重加锁，提高运行效率)
  public static SingletonOne getInstance(){
    if(null==uniqueInstance){
      synchronized (SingletonOne.class){
        if(null==uniqueInstance){
          uniqueInstance=new SingletonOne();
        }
      }

    }
    return uniqueInstance;
  }
  //单例模式自己的操作
  public void singletonOperation(){}
  //单例自己的属性
  private String singletionData;
  //外部通过此方法访问属性值
  public String getSingletionData(){
    return singletionData;
  }
}

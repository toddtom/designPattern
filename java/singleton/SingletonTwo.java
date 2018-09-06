package singleton;

/**
 * 饿汉式实现单例模式，在一开始就创建类实例，但只创建一次
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class SingletonTwo {
  //定义一个变量存储创建好的实例，在这里直接创建，只能创建一次
  private static SingletonTwo uniqueInstance=new SingletonTwo();
  //私有化构造方法，在内部控制类实例的个数
  private SingletonTwo(){}
  //定义一个方法为客户端提供类实例
  public static SingletonTwo getInstance(){
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

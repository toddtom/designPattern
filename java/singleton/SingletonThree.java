package singleton;

/**
 * lazy initialization holder class模式实现单例模式,实现延迟加载和保证了线程安全
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class SingletonThree {
  //类级内部类，只有在调用到的时候才会装载，实现延迟加载
  private static class SingletonHolder{
    //静态初始化器，由JVM来保证线程安全
    private static SingletonThree instance=new SingletonThree();
  }
  private SingletonThree(){}
  public static SingletonThree getInstance(){
    return SingletonHolder.instance;
  }
}

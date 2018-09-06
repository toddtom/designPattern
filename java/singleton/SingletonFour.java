package singleton;

/**
 * 通过枚举的方式实现单例模式，有JVM提供保证，防止多次实例化
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public enum SingletonFour {
  UNIQUEINSTANCE;
  public void singletonOperation(){}
}

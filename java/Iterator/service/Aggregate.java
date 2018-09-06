package Iterator.service;

public abstract class Aggregate {
  /**
   * 工厂方法，创建相应迭代器对象的接口
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public abstract Iterator createIterator();
}

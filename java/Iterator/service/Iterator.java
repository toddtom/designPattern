package Iterator.service;

/**
 * 方便访问的同意接口
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface Iterator {
  /**
   * 移动到聚合对象的第一个位置
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  void first();
  /**
   * 移动到聚合对象的下一个位置
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  void next();
  /**
   * 判断是否已经移动到聚合对象的最后一个位置
   * @param: params
   * @return: true表示已经移动到最后，false表示还没有移动到最后
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  boolean isDone();
  /**
   * 获取迭代的当前元素
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  Object currentItem();
}

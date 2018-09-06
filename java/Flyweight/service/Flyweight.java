package Flyweight.service;

/**
 * 描述授权数据的享元接口
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface Flyweight {
  /**
   * 判断传入的安全实体和权限，是否和享元对象内部状态匹配
   * @param: securityEntity 安全实体
   * @param: permit 权限
   * @return: false表示不匹配，true表示匹配
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  boolean match(String securityEntity,String permit);
}

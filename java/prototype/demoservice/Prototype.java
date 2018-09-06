package prototype.demoservice;

/**
 *原型接口
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface Prototype {
  Prototype clone();
  String getName();
  void setName(String name);
}

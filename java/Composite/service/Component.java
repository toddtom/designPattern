package Composite.service;

/**
 * 抽象的组件对象，为组合中的对象声明接口，实现接口的缺省行为
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public abstract class Component {
  //输出组件自身的名称
  public abstract void printStruct(String preStr);
  /**
   * 向组合对象中加入组件对象
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void addChild(Component child){
    //缺省的实现，抛出异常，因为叶子对象没有这个功能，或者子组件没有实现这个功能
    throw new UnsupportedOperationException("对象不支持这个功能");
  }
  /**
   * 从组合对象中移出某个组件对象
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void removeChild(Component child){
    //缺省的实现，抛出异常，因为叶子对象没有这个功能，或者子组件没有实现这个功能
    throw new UnsupportedOperationException("对象不支持这个功能");
  }

  /**
   * 返回某个索引对应的组件对象
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public Component getChildren(int index){
    //缺省的实现，抛出异常，因为叶子对象没有这个功能，或者子组件没有实现这个功能
    throw new UnsupportedOperationException("对象不支持这个功能");
  }
}

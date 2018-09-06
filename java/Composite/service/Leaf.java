package Composite.service;

/**
 * 叶子对象，叶子对象不在包含其他子对象
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Leaf extends Component {
  private String name="";

  public Leaf(String name) {
    this.name = name;
  }

  /**
   * 示意方法，叶子对象可能有自己的功能方法
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void printStruct(String preStr){
    System.out.println(preStr+"-"+name);
  }
}

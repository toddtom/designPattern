package interpreter.service;

/**
 * 定义属性作为终结符对应的解释器
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class PropertyTerminalExpression extends ReadXmlExpression {
  //属性的名字
  private String propName;

  public PropertyTerminalExpression(String propName) {
    this.propName = propName;
  }

  @Override
  public String[] interpret(Context c) {
    //直接获取最后的元素属性的值
    String[] ss=new String[1];
    ss[0]=c.getPreEles().get(0).getAttribute(this.propName);
    return ss;
  }
}

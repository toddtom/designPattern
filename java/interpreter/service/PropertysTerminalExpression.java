package interpreter.service;

import org.w3c.dom.Element;

import java.util.List;

/**
 * 以多个元素的属性作为终结符的解释处理对象
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class PropertysTerminalExpression extends ReadXmlExpression {
  //属性名字
  private String propName;

  public PropertysTerminalExpression(String propName) {
    this.propName = propName;
  }
  @Override
  public String[] interpret(Context c){
    //获取最后的多个元素
    List<Element> eles=c.getPreEles();
    String[] ss=new String[eles.size()];
    //循环多个元素，获取每个元素属性的值
    for(int i=0;i<ss.length;i++){
      ss[i] =eles.get(i).getAttribute(this.propName);
    }
    return ss;
  }
}

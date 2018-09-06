package interpreter.service;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 多个元素作为非终结符的解释处理对象
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class ElementsExpression extends ReadXmlExpression {
  //用来记录组合的ReadXmlExpression元素
  private Collection<ReadXmlExpression> eles=new ArrayList<>();
  //元素名字
  private String eleName="";

  public ElementsExpression(String eleName) {
    this.eleName = eleName;
  }
  @Override
  public String[] interpret(Context c){
    //先取出上下文中的父级元素
    List<Element> pEles=c.getPreEles();
    //把当前获取的元素放到上下文中，这次是获取多个元素
    List<Element> nowEles=new ArrayList<>();
    for(Element ele:pEles){
      nowEles.addAll(c.getNowEles(ele,eleName));
    }
    c.setPreEles(nowEles);
    //循环调用子元素的interpret方法
    String[] ss=null;
    for(ReadXmlExpression ele:eles){
      ss=ele.interpret(c);
    }
    return ss;
  }

  public boolean addEle(ReadXmlExpression ele){
    this.eles.add(ele);
    return true;
  }

  public boolean removeEle(ReadXmlExpression ele){
    this.eles.remove(ele);
    return true;
  }
}

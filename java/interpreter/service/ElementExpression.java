package interpreter.service;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 元素作为非终结符对应的解释器。解释并执行中间元素
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class ElementExpression extends ReadXmlExpression {
  //用来记录组合的ReadXmlExpression元素
  private Collection<ReadXmlExpression> eles=new ArrayList<>();
  private String eleName="";

  public ElementExpression(String eleName) {
    this.eleName = eleName;
  }
  public boolean addEle(ReadXmlExpression ele){
    this.eles.add(ele);
    return true;
  }
  public boolean removeEle(ReadXmlExpression ele){
    this.eles.remove(ele);
    return true;
  }

  @Override
  public String[] interpret(Context c){
    //先取出上下文中父级元素
    List<Element> pEles=c.getPreEles();
    Element ele=null;
    //把当前获取的元素放到上下文中
    List<Element> nowEles=new ArrayList<>();
    if(pEles.size()==0){
      //说明现在获取的是根元素
      ele=c.getDocument().getDocumentElement();
      pEles.add(ele);
      c.setPreEles(pEles);
    }else{
      //根据父级元素和要查找的元素的名称来获取当前的元素
      for(Element tempEle:pEles){
        nowEles.addAll(c.getNowEles(tempEle,eleName));
        if(nowEles.size()>0){
          //找到一个就停止
          break;
        }
      }
      List<Element> tempList=new ArrayList<>();
      tempList.add(nowEles.get(0));
      c.setPreEles(tempList);
    }
    String[] ss=null;
    for(ReadXmlExpression tempEle:eles){
      ss=tempEle.interpret(c);
    }
    return ss;
  }
}

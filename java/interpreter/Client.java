package interpreter;

import interpreter.service.*;

/**
 * 解释器模式客户端
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Client {
  public static void main(String[] args) throws Exception{
    //准备上下文
    Context c=new Context("InterpreterTest.xml");
    /*
    //想要获取c元素的值，也就是如下表达式的值："rot/a/b/c"，首先要构造解释器的抽象语法树
    ElementExpression root=new ElementExpression("root");
    ElementExpression aEle=new ElementExpression("a");
    ElementExpression bEle=new ElementExpression("b");
    ElementTerminalExpression cEle=new ElementTerminalExpression("c");
    root.addEle(aEle);
    root.addEle(bEle);
    root.addEle(cEle);
    String[] ss=root.interpret(c);
    System.out.println("c的值是"+ss[0]);

    //想要获取c元素的name属性，也就是如下表达式的值："rot/a/b/c.name"，首先要构造解释器的抽象语法树
    ElementExpression root=new ElementExpression("root");
    ElementExpression aEle=new ElementExpression("a");
    ElementExpression bEle=new ElementExpression("b");
    ElementExpression cEle=new ElementExpression("c");
    PropertyTerminalExpression prop=new PropertyTerminalExpression("name");
    root.addEle(aEle);
    aEle.addEle(bEle);
    bEle.addEle(cEle);
    cEle.addEle(prop);
    String[] ss=root.interpret(c);
    System.out.println("c的属性name的值是"+ss[0]);
    //如果要使用同一个上下文，连续进行解析，需要重新初始化上下文对象
    c.reInit();
    String[] ss2=root.interpret(c);
    System.out.println("重新获取c的属性name的值是"+ss2[0]);

    //想要获取多个d元素的值，也就是如下表达式："root/a/b/d$"，首先要构建解释器的抽象语法树
    ElementExpression root=new ElementExpression("root");
    ElementExpression aEle=new ElementExpression("a");
    ElementExpression bEle=new ElementExpression("b");
    ElementsTerminalExpression dEle=new ElementsTerminalExpression("d");
    root.addEle(aEle);
    aEle.addEle(bEle);
    bEle.addEle(dEle);
    String[] ss=root.interpret(c);
    for(String s:ss){
      System.out.println("d的值是="+s);
    }
    //想要获取d元素的Id属性，也就是如下表达式:"root/a/b/d$.id$",首先要构建解释器的抽象语法树
    ElementExpression root=new ElementExpression("root");
    ElementExpression aEle=new ElementExpression("a");
    ElementExpression bEle=new ElementExpression("b");
    ElementsExpression dEle=new ElementsExpression("d");
    PropertysTerminalExpression prop=new PropertysTerminalExpression("id");
    root.addEle(aEle);
    aEle.addEle(bEle);
    bEle.addEle(dEle);
    dEle.addEle(prop);
    String[] ss=root.interpret(c);
    for(String s:ss) {
      System.out.println("d的属性id的值是=" + s);
    }*/

    //通过解析器获取抽象语法树
    ReadXmlExpression re=Parser.parser("root/a/b/d$.id$");
    //请求解析，获取返回值
    String[] ss=re.interpret(c);
    for(String s:ss){
      System.out.println("d的属性id的值是="+s);
    }
    c.reInit();
    ReadXmlExpression re2=Parser.parser("root/a/b/d$");
    String[] ss2=re2.interpret(c);
    for(String s:ss2){
      System.out.println("d的值是="+s);
    }
  }
}

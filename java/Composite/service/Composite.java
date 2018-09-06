package Composite.service;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合对象，通常需要储存子对象，定义有子部件的部件行为，并
 * 实现在component里面定义的与子部件有关的操作
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Composite extends Component {
  //用来存储组合对象中包含的子组件对象
  private List<Component> childComponents=null;
  private String name="";

  public Composite(String name) {
    this.name = name;
  }

  /**
   * 示意方法，通常在里面需要实现递归的调用
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  @Override
  public void printStruct(String preStr){
    System.out.println(preStr+"-"+this.name);
    if(childComponents!=null){
      preStr+=" ";
      for(Component component:childComponents){

        //递归进行子组件相应方法的调用
        component.printStruct(preStr);
      }
    }
  }
  @Override
  public void addChild(Component child){
    //延迟初始化
    if(childComponents==null){
      childComponents=new ArrayList<>();
    }
    childComponents.add(child);
  }
  @Override
  public void removeChild(Component child){
    if(childComponents!=null){
      childComponents.remove(child);
    }
  }
  @Override
  public Component getChildren(int index){
    if(childComponents!=null){
      if(index>=0 && index<childComponents.size()){
        return childComponents.get(index);
      }
    }
    return null;
  }
}

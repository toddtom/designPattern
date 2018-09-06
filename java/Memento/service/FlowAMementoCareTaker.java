package Memento.service;

/**
 * 负责保存模拟运行流程A的对象的备忘录对象
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class FlowAMementoCareTaker {
  //记录被保存的备忘录对象
  private FlowAMockMemento memento=null;
  /**
   * 保存备忘录对象
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void saveMemento(FlowAMockMemento memento){
    this.memento=memento;
  }
  /**
   * 获取被保存的备忘录对象
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public FlowAMockMemento retriveMemento(){
    return this.memento;
  }
}

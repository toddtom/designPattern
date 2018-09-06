package Memento.service;

/**
 * 模拟运行流程A，代指某个具体流程
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class FlowAMock {
  //流程名称，不需要外部存储的状态数据
  private String flowName;
  //示意，代指某个中间结果，需要外部存储的状态数据
  private int tempResult;
  //示意，代指某个中间结果，需要外部存储的状态数据
  private String tempState;

  public FlowAMock(String flowName) {
    this.flowName = flowName;
  }
  /**
   * 运行流程的第一个阶段
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void runPhaseOne(){
    //在这个阶段，可能产生了中间结果，示意一下
    tempResult=3;
    tempState="PhaseOne";
  }
  /**
   * 示意，按照方案一来运行流程后半部分
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void schema1(){
    //示意，需要使用第一个阶段产生的数据
    this.tempState+=",Schema1";
    System.out.println(this.tempState+":now run"+tempResult);
    this.tempResult+=11;
  }
  /**
   *
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void schema2(){
    //示意，需要使用第一个阶段产生的数据
    this.tempState+=",Schema2";
    System.out.println(this.tempState+":now run"+tempResult);
    this.tempResult+=22;
  }
  /**
   * 创建保存原发器对象状态的备忘录对象
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public FlowAMockMemento createMemento(){
    return new MementoImpl(this.tempResult,this.tempState);
  }
  /**
   * 重新设置原发器对象的状态，让其回到备忘录对象记录的状态
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void setMemento(FlowAMockMemento memento){
    MementoImpl mementoImpl=(MementoImpl) memento;
    this.tempResult=mementoImpl.getTempResult();
    this.tempState=mementoImpl.getTempState();
  }
  /**
   * 真正的备忘录对象，实现备忘录窄接口,实现成私有的内部类，不让外部访问
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  private static class MementoImpl implements FlowAMockMemento{
    //示意，保存某个中间结果
    private int tempResult;
    //示意，保存某个中间结果
    private String tempState;
    public MementoImpl(int tempResult,String tempState){
      this.tempState=tempState;
      this.tempResult=tempResult;
    }

    public int getTempResult() {
      return tempResult;
    }

    public String getTempState() {
      return tempState;
    }
  }
}

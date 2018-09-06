package command.service;

/**
 * 机箱对象，本身有按钮，持有按钮对应的命令对象
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Box {
  //开机命令对象
  private Command openCommand;
  //重启命令对象
  private Command resetCommand;

  public void setOpenCommand(Command openCommand) {
    this.openCommand = openCommand;
  }

  public void setResetCommand(Command resetCommand) {
    this.resetCommand = resetCommand;
  }

  /**
   * 提供给客户使用，接收并响应用户请求，相当于按钮被按下触发的方法
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void openButtonPressed(){
    //按下按钮，执行命令
    openCommand.execute();
  }
  /**
   * 提供给客户使用，接收并响应用户请求，相当于重启按钮被按下触发的方法
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void resetButtonPressed(){
    resetCommand.execute();
  }
}

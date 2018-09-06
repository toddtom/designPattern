package command.service;

/**
 * 开机命令的实现，实现Command接口
 * 持有开机命令的真正实现，通过调用接收者的方法来实现命令
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class OpenCommand implements Command{
  //持有真正实现命令的接收者——主板对象
  private MainBoardApi mainBoard=null;

  public OpenCommand(MainBoardApi mainBoard) {
    this.mainBoard = mainBoard;
  }

  public void execute(){
    this.mainBoard.open();
  }
}

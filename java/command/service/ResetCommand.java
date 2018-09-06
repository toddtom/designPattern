package command.service;

public class ResetCommand implements Command {
  //持有真正实现命令的接收者——主板对象
  private MainBoardApi mainBoard=null;

  public ResetCommand(MainBoardApi mainBoard) {
    this.mainBoard = mainBoard;
  }
  public void execute(){
    //对于命令对象，根本不知道如何重启机器，会转调主板对象，让主板去完成重启
    this.mainBoard.reset();
  }
}

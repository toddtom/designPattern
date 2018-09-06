package adapter;

import adapter.model.LogModel;
import adapter.service.LogVersionOneService;
import adapter.service.LogVersionTwoService;

import java.util.List;

public class Adapter implements LogVersionTwoService {
  //需要被适配的接口对象
  private LogVersionOneService adaptee;

  public Adapter(LogVersionOneService adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void createLog(LogModel logModel){
    List<LogModel> list=adaptee.readLogFile();
    list.add(logModel);
    adaptee.writeLogFile(list);
  }

  @Override
  public List<LogModel> getAllLog(){
    return adaptee.readLogFile();
  }

  @Override
  public void removeLog(LogModel logModel){
    List<LogModel> list=adaptee.readLogFile();
    list.remove(logModel);
    adaptee.writeLogFile(list);
  }

  @Override
  public void updateLog(LogModel logModel){
    List<LogModel> lists=adaptee.readLogFile();
    for(LogModel list:lists){
      if(list.getLogId().equals(logModel.getLogId())){
        list=logModel;
        break;
      }
    }
    adaptee.writeLogFile(lists);
  }
}

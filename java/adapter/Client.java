package adapter;

import adapter.model.LogModel;
import adapter.service.LogVersionOneService;
import adapter.service.LogVersionOneServiceImpl;
import adapter.service.LogVersionTwoService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 适配器模式客户端
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Client {
  public static void main(String[] args) {
    LogModel logModel=new LogModel();
    logModel.setLogId("001");
    logModel.setOperateUser("admin");
    logModel.setOperateTime(new Date().toString());
    logModel.setLogContent("适配器模式测试");
    List<LogModel> LogModels=new ArrayList<>();
    LogModels.add(logModel);
    /*LogVersionOneService oneService=new LogVersionOneServiceImpl("");
    oneService.writeLogFile(LogModels);
    List<LogModel> allLog=oneService.readLogFile();
    System.out.println("allLog="+allLog);*/
    LogVersionOneService oneService=new LogVersionOneServiceImpl("");
    LogVersionTwoService adapter=new Adapter(oneService);
    adapter.createLog(logModel);
    List<LogModel> allLog=adapter.getAllLog();
    System.out.println("allLog="+allLog);
  }
}

package adapter.service;

import adapter.model.LogModel;

import java.util.List;

/**
 * 第二版日志操作，通过数据库操作日志，具体实现不做处理
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface LogVersionTwoService {
  void createLog(LogModel logModel);
  void updateLog(LogModel logModel);
  void removeLog(LogModel logModel);
  List<LogModel> getAllLog();
}

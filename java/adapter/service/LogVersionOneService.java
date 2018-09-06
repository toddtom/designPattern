package adapter.service;

import adapter.model.LogModel;

import java.util.List;

/**
 * 第一版日志处理，写入文件并能读取
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface LogVersionOneService {
  List<LogModel> readLogFile();
  void writeLogFile(List<LogModel> list);
}

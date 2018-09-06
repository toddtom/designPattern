package adapter.model;

import java.io.Serializable;

public class LogModel implements Serializable {
  private static final long servialVersionUID=1L;
  private String logId;//日志编号
  private String operateUser;//操作人员
  private String operateTime;//操作时间
  private String logContent;//日志内容

  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public String getOperateUser() {
    return operateUser;
  }

  public void setOperateUser(String operateUser) {
    this.operateUser = operateUser;
  }

  public String getOperateTime() {
    return operateTime;
  }

  public void setOperateTime(String operateTime) {
    this.operateTime = operateTime;
  }

  public String getLogContent() {
    return logContent;
  }

  public void setLogContent(String logContent) {
    this.logContent = logContent;
  }

  @Override
  public String toString() {
    return "LogModel{" +
        "logId='" + logId + '\'' +
        ", operateUser='" + operateUser + '\'' +
        ", operateTime='" + operateTime + '\'' +
        ", logContent='" + logContent + '\'' +
        '}';
  }
}

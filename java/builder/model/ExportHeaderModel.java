package builder.model;

import java.util.Date;
/**
 * 描述文件头部信息
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class ExportHeaderModel {
  //分公司或部门ID
  private String depId;
  //导出数据的日期
  private Date exportDate;

  public String getDepId() {
    return depId;
  }

  public void setDepId(String depId) {
    this.depId = depId;
  }

  public Date getExportDate() {
    return exportDate;
  }

  public void setExportDate(Date exportDate) {
    this.exportDate = exportDate;
  }
}

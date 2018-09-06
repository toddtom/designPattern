package builder.service;

import builder.model.ExportDataModel;
import builder.model.ExportFooterModel;
import builder.model.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * 生成器接口,定义创建一个输出文件对象所需的各个部件的操作
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public interface Builder {
  //构建输出文件的header部分
  void buildHeader(ExportHeaderModel ehm);
  //构建输出文件的body部分
  void bulidBody(Map<String,Collection<ExportDataModel>> mapData);
  //构建输出文件的footer部分
  void bulidFooter(ExportFooterModel efm);
}

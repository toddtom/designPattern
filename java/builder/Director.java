package builder;

import builder.model.ExportDataModel;
import builder.model.ExportFooterModel;
import builder.model.ExportHeaderModel;
import builder.service.Builder;

import java.util.Collection;
import java.util.Map;
/**
 * 指导者,负责构建产品，整体的构造算法
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }
  public void construct(ExportHeaderModel ehm,Map<String,Collection<ExportDataModel>> mapData,ExportFooterModel efm){
    builder.buildHeader(ehm);
    builder.bulidBody(mapData);
    builder.bulidFooter(efm);
  }
}

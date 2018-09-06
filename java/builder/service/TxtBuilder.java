package builder.service;

import builder.model.ExportDataModel;
import builder.model.ExportFooterModel;
import builder.model.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * 具体的生成器
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class TxtBuilder implements Builder {
  //用于记录构建的文件的内容，相当于产品
  private StringBuffer buffer=new StringBuffer();
  public void bulidBody(Map<String,Collection<ExportDataModel>> mapData){
    for(String tblName:mapData.keySet()){
      //先拼接表名称
      buffer.append(tblName+"\n");
      //循环拼接具体内容
      for(ExportDataModel edm:mapData.get(tblName)){
        buffer.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");
      }
    }
  }
  public void bulidFooter(ExportFooterModel efm){
    buffer.append(efm.getExportUser());
  }
  public void buildHeader(ExportHeaderModel ehm){
    buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
  }
  //返回装配好的产品
  public StringBuffer getResult(){
    return buffer;
  }
}

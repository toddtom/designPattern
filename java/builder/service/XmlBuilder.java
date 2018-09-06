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
public class XmlBuilder implements Builder {
  //用于记录构建的文件的内容，相当于产品
  private StringBuffer buffer=new StringBuffer();
  public void bulidBody(Map<String,Collection<ExportDataModel>> mapData){
    buffer.append(" <Body>\n");
    for(String tblName:mapData.keySet()){
      buffer.append("   <Datas TableName=\""+tblName+"\">\n");
      for(ExportDataModel edm:mapData.get(tblName)){
        buffer.append("     <Data>\n");
        buffer.append("       <ProductId>"+edm.getProductId()+"</ProductId>\n");
        buffer.append("       <Price>"+edm.getPrice()+"</Price>\n");
        buffer.append("       <Amount>"+edm.getAmount()+"</Amount>\n");
        buffer.append("     </Data>\n");
      }
      buffer.append("   </Datas>\n");
      buffer.append(" <Body>\n");
    }
  }
  public void bulidFooter(ExportFooterModel efm){
    buffer.append(" <Footer>\n");
    buffer.append("   <ExportUser>"+efm.getExportUser()+"</ExportUser>\n");
    buffer.append(" </Footer>\n");
    buffer.append("</Report>\n");
  }
  public void buildHeader(ExportHeaderModel ehm){
    buffer.append("<?xml version='1.0' encoding='utf-8'?>\n");
    buffer.append("<Report>\n");
    buffer.append(" <Header>\n");
    buffer.append("   <DepId>"+ehm.getDepId()+"</DepId>\n");
    buffer.append("   <ExportDate>"+ehm.getExportDate()+"</ExportDate>\n");
    buffer.append(" </Header>\n");
  }
  //返回装配好的产品
  public StringBuffer getResult() {
    return buffer;
  }
}

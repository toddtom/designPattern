package builder;

import builder.model.ExportDataModel;
import builder.model.ExportFooterModel;
import builder.model.ExportHeaderModel;
import builder.service.TxtBuilder;
import builder.service.XmlBuilder;

import java.util.*;

/**
 * 生成器模式（builder）客户端
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Client {
  public static void main(String[] args) {
    ExportHeaderModel ehm=new ExportHeaderModel();
    ehm.setDepId("一分公司");
    ehm.setExportDate(new Date());
    Map<String,Collection<ExportDataModel>> mapData=new HashMap<>();
    Collection<ExportDataModel> col=new ArrayList<>();
    ExportDataModel edm1=new ExportDataModel();
    edm1.setProductId("产品001号");
    edm1.setPrice(100);
    edm1.setAmount(80);
    ExportDataModel edm2=new ExportDataModel();
    edm2.setProductId("产品002号");
    edm2.setPrice(99);
    edm2.setAmount(50);
    col.add(edm1);
    col.add(edm2);
    mapData.put("销售记录表",col);
    ExportFooterModel efm=new ExportFooterModel();
    efm.setExportUser("张三");
    //创建输出到文本文件
    TxtBuilder txtBuilder=new TxtBuilder();
    //创建指导者对象
    Director director=new Director(txtBuilder);
    director.construct(ehm,mapData,efm);
    System.out.println("输出到文本文件的内容: \n"+txtBuilder.getResult());
    //创建输出到xml文件
    XmlBuilder xmlBuilder=new XmlBuilder();
    Director director2=new Director(xmlBuilder);
    director2.construct(ehm,mapData,efm);
    System.out.println("输出到文本文件的内容: \n"+xmlBuilder.getResult());
  }
}

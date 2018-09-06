package factoryMethod.service;

public class ExportTxtServiceImpl implements ExportFileService {
  public boolean export(String data){
    System.out.println("导出数据"+data+"到文本文件");
    return true;
  }
}

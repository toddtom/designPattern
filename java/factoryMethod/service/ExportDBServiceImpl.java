package factoryMethod.service;

public class ExportDBServiceImpl implements ExportFileService {
  public boolean export(String data){
    System.out.println("导出数据"+data+"到数据库备份文件");
    return true;
  }
}

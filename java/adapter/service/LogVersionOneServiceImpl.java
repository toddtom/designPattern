package adapter.service;

import adapter.model.LogModel;

import java.io.*;
import java.util.List;

public class LogVersionOneServiceImpl implements LogVersionOneService {
  private String logFilePath="D:Adapter.log";

  public LogVersionOneServiceImpl(String logFilePath) {
    if(null!=logFilePath && logFilePath.trim().length()>0){
      this.logFilePath = logFilePath;
    }
  }

  @Override
  public List<LogModel> readLogFile(){
    List<LogModel> list=null;
    ObjectInputStream oin=null;
    try {
      File file=new File(logFilePath);
      if(file.exists()){
        oin=new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
        list=(List<LogModel>)oin.readObject();
      }
    }catch (Exception e){
      e.printStackTrace();
    }finally {
      try {
        if(null!=oin){
          oin.close();
        }
      }catch (IOException e){
        e.printStackTrace();
      }
    }
    return list;
  }

  @Override
  public void writeLogFile(List<LogModel> list){
    File file=new File(logFilePath);
    ObjectOutputStream oout=null;
    try {
      oout=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
      oout.writeObject(list);
    }catch (IOException e){
      e.printStackTrace();
    }finally {
      try {
        oout.close();
      }catch (IOException e){
        e.printStackTrace();
      }
    }
  }
}

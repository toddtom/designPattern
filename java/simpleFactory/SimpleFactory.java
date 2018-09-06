package simpleFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SimpleFactory {

  public static SimpleService createService(){
    Properties p=new Properties();
    InputStream in=null;
    try{
      in= SimpleFactory.class.getResourceAsStream("FactoryTest.properties");
      p.load(in);
    }catch(IOException e){
      System.out.println("装载配置工厂出错");
    }finally{
      try {
        in.close();
      }catch (IOException e1){
        e1.printStackTrace();
      }
    }
    SimpleService service=null;
    try {
      service=(SimpleService)Class.forName(p.getProperty("implClass")).newInstance();
    }catch (InstantiationException e){
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
    return service;
  }
}

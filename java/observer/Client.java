package observer;

import observer.service.NewsPaper;
import observer.service.Reader;

/**
 * 观察者模式客户端
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Client {
  public static void main(String[] args) {
    //创建一个报纸，作为被观察者
    NewsPaper subject=new NewsPaper();
    //创建阅读者，也就是观察者
    Reader reader1=new Reader();
    reader1.setName("张三");

    Reader reader2=new Reader();
    reader2.setName("李四");

    Reader reader3=new Reader();
    reader3.setName("王五");

    //注册阅读者
    subject.attach(reader1);
    subject.attach(reader2);
    subject.attach(reader3);

    //要出报纸了
    subject.setContent("本期内容是观察者模式");
  }
}

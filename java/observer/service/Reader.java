package observer.service;

/**
 * 真正的读者，为了简单描述一下姓名
 * @param: params
 * @return: returns
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Reader implements Observer {
  //读者的姓名
  private String name;
  //拉模式获取数据
  public void update(Subject subject){
    System.out.println(name+"收到报纸了，阅读它，内容是==="+((NewsPaper)subject).getContent());
  }
  /*推模式获取数据,直接传入接收的数据
  public void update(String content){
    System.out.println(name+"收到报纸了，阅读它，内容是==="+content);
  }*/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

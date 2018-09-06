package observer.service;

/**
 * 报纸对象，具体的目标实现
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class NewsPaper extends Subject {
  //报纸的具体内容
  private String content;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
    //内容有了，说明又出新报纸了，需要通知所有的读者
    notifyObservers();
  }
}

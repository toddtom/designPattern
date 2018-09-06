package ChainOfResponsibility.model;

/**
 * 通用请求对象
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class RequestModel {
  //表示具体的业务类型
  private String type;

  public RequestModel(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
}

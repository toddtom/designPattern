package templateMethod.service;

import templateMethod.model.LoginModel;

/**
 * 工作人员登录控制的逻辑处理
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class WorkerLogin extends LoginTemplate {
  public LoginModel findLoginUser(String loginId){
    LoginModel lm=new LoginModel();
    lm.setLoginId(loginId);
    lm.setPwd("workerpwd");
    return lm;
  }
  public String encryptPwd(String pwd){
    //覆盖父类的方法，提供真正的加密算法，这里对密码进行加密，比如MD5，3DES等，此处省略
    System.out.println("使用MD5进行秘密加密");
    return pwd;
  }
}

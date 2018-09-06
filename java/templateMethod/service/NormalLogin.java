package templateMethod.service;

import templateMethod.model.LoginModel;

/**
 * 普通用户登录控制的逻辑处理
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class NormalLogin extends LoginTemplate {
  public LoginModel findLoginUser(String loginId){
    LoginModel lm=new LoginModel();
    lm.setPwd("testpwd");
    lm.setLoginId(loginId);
    return lm;
  }
}

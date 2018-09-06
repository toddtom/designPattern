package templateMethod.service;

import templateMethod.model.LoginModel;

/**
 * 登录控制的模板
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public abstract class LoginTemplate {
  /**
   * 判断登录数据是否正确，也就是是否登录成功
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public final boolean login(LoginModel lm){
    //1.根据登录人员的编号去获取相应的数据
    LoginModel dblm=this.findLoginUser(lm.getLoginId());
    if(dblm!=null){
      //2.对密码进行加密
      String encryptPwd=this.encryptPwd(lm.getPwd());
      //把加密后的密码设置回到登录数据模型中
      lm.setPwd(encryptPwd);
      //3.判断是否匹配
      return this.match(lm,dblm);
    }
    return false;
  }
  /**
   * 根据登录编号来查找和获取存储中相应的数据
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public abstract LoginModel findLoginUser(String loginId);

  public String encryptPwd(String pwd){
    return pwd;
  }

  public boolean match(LoginModel lm,LoginModel dblm){
    if(lm.getLoginId().equals(dblm.getLoginId())
        && lm.getPwd().equals(dblm.getPwd())){
      return true;
    }
    return false;
  }
}

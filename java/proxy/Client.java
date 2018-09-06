package proxy;

import proxy.service.UserModelApi;

import java.util.Collection;

/**
 * 代理模式客户端
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Client {
  public static void main(String[] args) throws Exception{
    UserManager userManager=new UserManager();
    Collection<UserModelApi> col=userManager.getUserByDepId("0101");
    //如果只是显示用户名称，不需要重新查询数据库
    for(UserModelApi umApi:col){
      System.out.println("用户编号：="+umApi.getUserId()+"，用户姓名：="+umApi.getName());
    }
    //如果访问非用户编号和姓名以外的属性，则重新查询数据库
    for(UserModelApi umApi:col){
      System.out.println("用户编号：="+umApi.getUserId()+"，用户姓名：="+umApi.getName()+"，所属部门：="+umApi.getDepId());
    }
  }
}

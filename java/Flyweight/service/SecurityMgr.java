package Flyweight.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 安全管理，实现成单例
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class SecurityMgr {
  private static SecurityMgr securityMgr=new SecurityMgr();
  private SecurityMgr(){}
  public static SecurityMgr getInstance(){
    return securityMgr;
  }
  //在运行期间，用来存放登录人员对应的权限，在web期间，这些数据通常会存放到session中
  private Map<String,Collection<Flyweight>> map=new HashMap<>();
  /**
   * 模拟登录的功能
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public void login(String user){
    //登录时就需要把该用户所拥有的权限，从数据库中取出来，放到缓存中去
    Collection<Flyweight> col=queryByUser(user);
    map.put(user,col);
  }
  /**
   * 判断用户对某个安全实体是否拥有某种权限
   * @param: params
   * @return: returns
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public boolean hasPermit(String user,String securityEntity,String permit){
    Collection<Flyweight> col=map.get(user);
    if(col==null || col.size()==0){
      System.out.println(user+"没有登录或是没有被分配任何权限");
      return false;
    }
    for(Flyweight fm:col){
      //输出当前实例，看看是否同一个实例
      System.out.println("fm=="+fm);
      if(fm.match(securityEntity,permit)){
        return true;
      }
    }
    return false;
  }

  private Collection<Flyweight> queryByUser(String user){
    Collection<Flyweight> col=new ArrayList<>();
    for(String s: TestDB.colDB){
      String ss[]=s.split(",");
      if(ss[0].equals(user)){
        Flyweight fm=FlyweightFactory.getInstance().getFlyweight(ss[1]+","+ss[2]);
        col.add(fm);
      }
    }
    return col;
  }
}

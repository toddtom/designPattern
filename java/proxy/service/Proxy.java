package proxy.service;

import proxy.UserModel;

import java.sql.*;

public class Proxy implements UserModelApi {
  //持有被代理的具体目标对象
  private UserModel realSubject=null;
  public Proxy(UserModel realSubject){
    this.realSubject=realSubject;
  }
  //是否已经重新装载过数据
  private boolean loaded=false;
  public String getUserId(){
    return realSubject.getUserId();
  }
  public void setUserId(String userId){
    realSubject.setUserId(userId);
  }
  public String getName(){
    return realSubject.getName();
  }
  public void setName(String name){
    realSubject.setName(name);
  }
  public String getDepId(){
    if(!this.loaded){
      reload();
      this.loaded=true;
    }
    return realSubject.getDepId();
  }
  public void setDepId(String depId){
    realSubject.setDepId(depId);
  }
  public String getSex(){
    if(!this.loaded){
      reload();
      this.loaded=true;
    }
    return realSubject.getSex();
  }
  public void setSex(String sex){
    realSubject.setSex(sex);
  }
  /**
   * 重新查询数据库以获取完整的用户数据
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  private void reload(){
    System.out.println("重新查询数据库获取完整的用户数据,userId=="+realSubject.getUserId());
    Connection conn=null;
    try {
      conn=this.getConnection();
      String sql="select * from tbl_user where userId=?";
      PreparedStatement pstmt=conn.prepareStatement(sql);
      pstmt.setString(1,realSubject.getUserId());
      ResultSet rs=pstmt.executeQuery();
      if(rs.next()){
        realSubject.setDepId(rs.getString("depId"));
        realSubject.setSex(rs.getString("sex"));
      }
      rs.close();
      pstmt.close();
    }catch (Exception e){
      e.printStackTrace();
    }finally {
      try {
        conn.close();
      }catch (SQLException e){
        e.printStackTrace();
      }
    }
  }

  @Override
  public String toString() {
    return "Proxy{" +
        "realSubject=" + realSubject +
        ", loaded=" + loaded +
        '}';
  }
  private Connection getConnection() throws Exception{
    Class.forName("对应的数据库驱动");
    return DriverManager.getConnection("url","username","password");
  }
}

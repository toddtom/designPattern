package proxy;

import proxy.service.Proxy;
import proxy.service.UserModelApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

public class UserManager {
  /**
   * 根据部门编号获取该部门下所有员工
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public Collection<UserModelApi> getUserByDepId(String depId) throws Exception{
    Collection<UserModelApi> col=new ArrayList<>();
    Connection conn=null;
    try {
      conn=this.getConnection();
      String sql="select u.userId,u.name from tbl_user u,tbl_dep d where u.depId=d.depId and d.depId like ?";
      PreparedStatement pstm=conn.prepareStatement(sql);
      pstm.setString(1,depId+"%");
      ResultSet rs=pstm.executeQuery();
      while (rs.next()){
        //创建的是代理对象，不是直接创建userModel对象
        Proxy proxy=new Proxy(new UserModel());
        proxy.setUserId(rs.getString("userId"));
        proxy.setName(rs.getString("name"));
        col.add(proxy);
      }
      rs.close();
      pstm. close();
    }finally {
      conn.close();
    }
    return col;
  }
  private Connection getConnection() throws Exception{
    Class.forName("对应的数据库驱动");
    return DriverManager.getConnection("url","username","password");
  }
}

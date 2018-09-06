package proxy;

import proxy.service.UserModelApi;

public class UserModel implements UserModelApi{
  private String userId;
  private String name;
  private String depId;
  private String sex;

  @Override
  public String getUserId() {
    return userId;
  }

  @Override
  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getDepId() {
    return depId;
  }

  @Override
  public void setDepId(String depId) {
    this.depId = depId;
  }

  @Override
  public String getSex() {
    return sex;
  }

  @Override
  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "UserModel{" +
        "userId='" + userId + '\'' +
        ", name='" + name + '\'' +
        ", depId='" + depId + '\'' +
        ", sex='" + sex + '\'' +
        '}';
  }
}

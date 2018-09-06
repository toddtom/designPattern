package ChainOfResponsibility.service;

import ChainOfResponsibility.model.FeeRequestModel;
import ChainOfResponsibility.model.RequestModel;

/**
 * 项目经理职责链
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class ProjectManager extends Handler {
  @Override
  public Object handlerRequest(RequestModel rm){
    if(FeeRequestModel.FEE_TYPE.equals(rm.getType())){
      //表示聚餐费用申请
      return handlerFeeRequest(rm);
    }else{
      //其他的项目经理暂时不想处理
      return super.handlerRequest(rm);
    }
  }
  /**
   * 处理聚餐费用的申请
   * @param: user 申请人
   * @param: fee 申请的费用
   * @return: 成功或失败的具体通知
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  private Object handlerFeeRequest(RequestModel rm){
    FeeRequestModel frm=(FeeRequestModel)rm;
    String str="";
    //项目经理的权限小，只能同意500以内的请求
    if(frm.getFee()<500){
      //测试，只同意小李的请求
      if("小李".equals(frm.getUser())){
        str="项目经理同意"+frm.getUser()+"聚餐费用"+frm.getFee()+"元的申请";
      }else {
        //其他人一律不同意
        str="项目经理不同意"+frm.getUser()+"聚餐费用"+frm.getFee()+"元的申请";
      }
      return str;
    }else{
      //超过500，继续传递给级别更高的人处理
      if(this.successor!=null){
        return successor.handlerRequest(rm);
      }
    }
    return str;
  }
}

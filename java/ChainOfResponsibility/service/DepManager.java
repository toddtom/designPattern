package ChainOfResponsibility.service;

import ChainOfResponsibility.model.FeeRequestModel;
import ChainOfResponsibility.model.RequestModel;

/**
 * 部门经理职责链
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class DepManager extends Handler{
  @Override
  public Object handlerRequest(RequestModel rm){
    if(FeeRequestModel.FEE_TYPE.equals(rm.getType())){
      //表示聚餐费用申请
      return handlerFeeRequest(rm);
    }else{
      //其他的部门经理暂时不想处理
      return super.handlerRequest(rm);
    }
  }
  private Object handlerFeeRequest(RequestModel rm){
    FeeRequestModel frm=(FeeRequestModel)rm;
    String str="";
    //部门经理的权限只能同意1000以内的请求
    if(frm.getFee()<1000){
      //测试，只同意小李的请求
      if("小李".equals(frm.getUser())){
        str="部门经理同意"+frm.getUser()+"聚餐费用"+frm.getFee()+"元的申请";
      }else {
        //其他人一律不同意
        str="部门经理不同意"+frm.getUser()+"聚餐费用"+frm.getFee()+"元的申请";
      }
      return str;
    }else{
      //超过1000，继续传递给级别更高的人处理
      if(this.successor!=null){
        return successor.handlerRequest(rm);
      }
    }
    return str;
  }
}

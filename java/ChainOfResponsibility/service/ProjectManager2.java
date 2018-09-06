package ChainOfResponsibility.service;

import ChainOfResponsibility.model.PreFeeRequestModel;
import ChainOfResponsibility.model.RequestModel;

/**
 * 实现为项目经理增加预支差旅费申请处理功能的子对象
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class ProjectManager2 extends ProjectManager {
  @Override
  public Object handlerRequest(RequestModel rm){
    if(PreFeeRequestModel.FEE_TYPE.equals(rm.getType())){
      //表示预支差旅费用
      return myHandler(rm);
    }else{
      //其他的让父类处理
      return super.handlerRequest(rm);
    }
  }
  /**
   * 处理预支差旅费用的申请
   * @param: user 申请人
   * @param: requestFee 申请费用
   * @return: 是否同意
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  private Object myHandler(RequestModel rm){
    //先把通用对象造型出来
    PreFeeRequestModel frm=(PreFeeRequestModel)rm;
    //项目经理权限小，只能在5000以内
    if(frm.getFee()<5000){
      System.out.println("项目经理同意"+frm.getUser()+"预支差旅费用"+frm.getFee()+"元的请求");
      return true;
    }else{
      //超过5000，传递给级别更高的人处理
      if(this.successor!=null){
        return this.successor.handlerRequest(rm);
      }
    }
    return false;
  }
}

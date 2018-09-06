package ChainOfResponsibility.service;

import ChainOfResponsibility.model.PreFeeRequestModel;
import ChainOfResponsibility.model.RequestModel;

/**
 * 实现为总经理增加预支差旅费申请处理功能的子对象
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class GeneralManager2 extends GeneralManager {
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
  private Object myHandler(RequestModel rm){
    //先把通用对象造型出来
    PreFeeRequestModel frm=(PreFeeRequestModel)rm;
    //总经理的权限可以处理任意费用
    if(frm.getFee()>=10000){
      System.out.println("总经理同意"+frm.getUser()+"预支差旅费用"+frm.getFee()+"元的请求");
      return true;
    }else{
      //如果还有后续的处理，继续传递
      if(this.successor!=null){
        return this.successor.handlerRequest(rm);
      }
    }
    return false;
  }
}

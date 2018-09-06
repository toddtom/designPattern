package ChainOfResponsibility;

import ChainOfResponsibility.model.FeeRequestModel;
import ChainOfResponsibility.model.PreFeeRequestModel;
import ChainOfResponsibility.service.DepManager2;
import ChainOfResponsibility.service.GeneralManager2;
import ChainOfResponsibility.service.Handler;
import ChainOfResponsibility.service.ProjectManager2;

/**
 * 职责链模式客户端
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class Client {
  public static void main(String[] args) {
    Handler h1=new GeneralManager2();
    Handler h2=new DepManager2();
    Handler h3=new ProjectManager2();
    h3.setSuccessor(h2);
    h2.setSuccessor(h1);

    //开始测试申请聚餐费用
    FeeRequestModel frm=new FeeRequestModel();
    frm.setFee(300);
    frm.setUser("小李");
    String ret1=(String)h3.handlerRequest(frm);
    System.out.println("the ret1="+ret1);
    //重新设置申请金额，再调用处理
    frm.setFee(800);
    h3.handlerRequest(frm);
    String ret2=(String)h3.handlerRequest(frm);
    System.out.println("the ret2="+ret2);
    //重新设置申请金额，再调用处理
    frm.setFee(1600);
    h3.handlerRequest(frm);
    String ret3=(String)h3.handlerRequest(frm);
    System.out.println("the ret2="+ret3);

    //开始测试申请差旅费用
    PreFeeRequestModel pfrm=new PreFeeRequestModel();
    pfrm.setFee(3000);
    pfrm.setUser("小张");
    h3.handlerRequest(pfrm);
    //重新设置申请金额，再调用处理
    pfrm.setFee(8000);
    h3.handlerRequest(pfrm);
    //重新设置申请金额，再调用处理
    pfrm.setFee(12000);
    h3.handlerRequest(pfrm);
  }
}

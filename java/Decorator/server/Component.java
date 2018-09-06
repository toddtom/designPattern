package Decorator.server;

import java.util.Date;

/**
 * 计算奖金的组件接口
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public abstract class Component {
  /**
   * 计算某人在某段时间内的奖金
   * @param: user 被计算奖金的人员
   * @param: begin 计算奖金的开始时间
   * @param: end 计算奖金的结束时间
   * @return: 某人在某段时间内的奖金
   *
   * @since 1.0
   * @version 1.0
   * @author: tao kai (tao.kai@sccaptain.com.cn)
   */
  public abstract double calcPrize(String user,Date begin,Date end);
}

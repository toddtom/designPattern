package interpreter.service;

/**
 * 用于处理自定义xml取值表达式的接口
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public abstract class ReadXmlExpression {
  public abstract String[] interpret(Context c);
}

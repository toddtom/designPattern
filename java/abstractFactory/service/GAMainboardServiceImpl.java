package abstractFactory.service;
/**
 * 具体产品类
 *
 * @since 1.0
 * @version 1.0
 * @author: tao kai (tao.kai@sccaptain.com.cn)
 */
public class GAMainboardServiceImpl implements MainboardService {
  //cpu插槽数
  private int cpuHoles=0;

  public GAMainboardServiceImpl(int cpuHoles) {
    this.cpuHoles = cpuHoles;
  }
  public void installCPU(){
    System.out.println("now in GAMainboard,cpuHoles="+cpuHoles);
  }
}

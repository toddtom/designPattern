package abstractFactory;

import abstractFactory.factory.AbstractFactory;
import abstractFactory.service.CPUService;
import abstractFactory.service.MainboardService;

public class ComputerEngineer {
  private CPUService cpu=null;
  private MainboardService mainboard=null;
  //装机
  public void makeComputer(AbstractFactory schema){
    //准备好装机材料
    prepareHardwares(schema);
  }
  private void prepareHardwares(AbstractFactory schema){
    this.cpu=schema.createCPUService();
    this.mainboard=schema.createMainboardService();
    this.cpu.calculate();
    this.mainboard.installCPU();
  }
}

package state_design_pattern_www.geeksforgeeks.org;

public class VendingMachineContext {
   private VendingMachineState vendingMachineState;

   public void setState(VendingMachineState vendingMachineState){
       this.vendingMachineState=vendingMachineState;
    }
    public void request(){
       vendingMachineState.handleRequest();
    }
}

package state_design_pattern_www.geeksforgeeks.org;

public class OutOfStockState implements VendingMachineState {

    @Override
    public void handleRequest() {
        System.out.println("Out Of Stock State : Product unavailable.Please select anather product");
    }
}

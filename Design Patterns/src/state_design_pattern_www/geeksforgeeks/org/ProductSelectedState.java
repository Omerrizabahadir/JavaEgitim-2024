package state_design_pattern_www.geeksforgeeks.org;

public class ProductSelectedState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Product Selected State : Processing payment." );
    }
}

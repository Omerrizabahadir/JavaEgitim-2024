package state_design_pattern_www.geeksforgeeks.org;

public class ReadyState implements VendingMachineState{

    @Override
    public void handleRequest() {
        System.out.println("Ready state : Please select a product ! ");
    }
}

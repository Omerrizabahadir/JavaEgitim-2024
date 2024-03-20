package state_design_pattern_www.geeksforgeeks.org;

public class PaymentPandingState implements VendingMachineState{
    @Override
    public void handleRequest() {
        System.out.println("Payment Panding State : Dispensing product.");
    }
}

package state_design_pattern_www.geeksforgeeks.org;

public class Main {
    public static void main(String[] args) {
        VendingMachineContext vendingMachineContext=new VendingMachineContext();


        vendingMachineContext.setState(new ReadyState());
        vendingMachineContext.request();
        System.out.println("--------------------------");
        vendingMachineContext.setState(new ProductSelectedState());
        vendingMachineContext.request();

        System.out.println("--------------------------");
        vendingMachineContext.setState(new PaymentPandingState());
        vendingMachineContext.request();

        System.out.println("--------------------------");

        vendingMachineContext.setState(new OutOfStockState());
        vendingMachineContext.request();


    }
}

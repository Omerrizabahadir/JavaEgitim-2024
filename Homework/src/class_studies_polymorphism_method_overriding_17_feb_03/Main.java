package class_studies_polymorphism_method_overriding_17_feb_03;

public class Main {

    public static void main(String[] args) {
        Bank bank=new Bank();
        Bank bank1=new AkBank();
        Bank bank2=new INGBank();
        Bank bank3=new ZiraatBank();
        System.out.println("Akbank faiz oranı : "+bank1.getRateOfInterest());
        System.out.println("ING bank faiz oranı : "+bank2.getRateOfInterest());
        System.out.println("Ziraat bank faiz oranı : "+bank3.getRateOfInterest());
    }


}

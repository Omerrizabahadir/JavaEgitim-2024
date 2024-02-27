package class_studies_polymorphism_method_overloding_17_feb_01;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        int result1=calculator.sum(3,6);
        System.out.println("topla int : "+result1);

        double result2=calculator.sum(3,2.6);
        System.out.println("topla double : "+result2);

        double result3=calculator.sum(45,12.4);
        System.out.println("topla double : "+result3);

        long result4=calculator.sum(234,432);
        System.out.println("topla long : "+result4);


    }
}

package functional_interface.functional_interface_04;

public class FunctionalInterfaceExample04 {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation substruction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> (a / b);


        //@FunctionalInterface teki abstract metodun operate 'i
        System.out.println("a+b = "+addition.operate(12,45));
        System.out.println("a-b = "+substruction.operate(12,45));
        System.out.println("a*b = "+multiplication.operate(12,45));
        System.out.println("a/b = "+division.operate(90,45));

        System.out.println("---------------");

       //alttaki operate metodunun kullanımı
        System.out.println("a+b = " + operate(12, 45, addition));
        System.out.println("a-b = " + operate(12, 45, substruction));
        System.out.println("a*b = " + operate(12, 45, multiplication));
        System.out.println("a/b = " + operate(90, 45, division));


    }

    private static int operate(int a, int b, MathOperation mathOperation) {

        return mathOperation.operate(a, b);


    }
}

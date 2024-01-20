package begin_with_java_questions;

public class Method {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 8;


        sum(num1, num2);
        mult(num1, num2);
        div(num1, num2);
        subs(num1, num2);


    }

    public static void sum(int number1, int number2) {
        System.out.println("Toplama işlemi :" + (number1 + number2));
    }

    public static void mult(int number1, int number2) {
        System.out.println("Çarpma işlemi :" + (number1 * number2));
    }

    public static void div(double number1, double number2) {
        System.out.println("Bölme işlemi :" + (number1 / number2));

    }

    public static void subs(int num1ber1, int number2) {
        System.out.println("Çıkarma işlemi :" + (num1ber1 - number2));
    }
}
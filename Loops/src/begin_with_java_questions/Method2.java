package begin_with_java_questions;

import java.util.Scanner;

public class Method2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("birinci sayı giriniz:");
       int number1=scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
       int number2=scanner.nextInt();
       buyukBul(number1,number2);

    }
    public static int buyukBul(int num1,int num2) {
        if (num1 < num2) {
            System.out.println(num2 + " büyüktür " + num1);
            return num1;
        } else if(num1>num2){
            System.out.println(num1+" büyüktür "+num2);
            return num2;
        }else{
            System.out.println(num1+" eşittir "+num2);
            return num1;
        }
    }
}

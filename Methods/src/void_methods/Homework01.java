package void_methods;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        //kullanıcıdan alınan iki sayının
        // toplama,çıkarma,çarpma ve bölme metodlarını
        // main metoddan void ile nasıl yazarız

        Scanner scanner=new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz: ");
        int number1=scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        int number2=scanner.nextInt();

        sum(number1,number2);
        subs(number1,number2);
        mult(number1,number2);
        div(number1,number2);

    }

    public static void sum(int num1,int num2){
        System.out.println("toplama işlemi :" + (num1+num2));
    }
    public static void subs(int num1,int num2){
        System.out.println("çıkarmama işlemi :" + (num1-num2));
    }
    public static void mult(int num1,int num2){
        System.out.println("çarpma işlemi :" + (num1*num2));
    }
    public static void div(double num1,double num2){
        System.out.println("bölme işlemi :" + (num1/num2));
    }
}

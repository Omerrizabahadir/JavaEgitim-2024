import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;

        boolean result1 = number1 > number2 && number1 < 0 && number2 > 0;
        System.out.println("Sonuç :" + result1);
        boolean result2 = number2 < 0 || number2 > number1 && number1 > 0;
        System.out.println("Sonuç2 :" + result2);


        String name = "bilgeAdam";
        int uzunluk = name.length();
        System.out.println(uzunluk);
        System.out.println(name.contains("e"));
        System.out.println(name.toUpperCase());
        System.out.println(name.concat("Eğitim"));


        String telephoneNumber = "05324567656";
        String turkcell = "0532";
        String vodafone = "0542";
        System.out.println("Turkcell mi?:" + telephoneNumber.startsWith(turkcell));

        if (telephoneNumber.startsWith("0532")) {
            System.out.println("Hattınız : Turkcell");
        } else {
            System.out.println("Hattınız Vodafon");
        }
    }

}



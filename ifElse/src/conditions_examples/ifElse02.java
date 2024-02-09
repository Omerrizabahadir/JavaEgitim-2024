package conditions_examples;

import java.util.Scanner;

public class ifElse02 {
    public static void main(String[] args) {
        String gender = "F";
        int age = 12;

        System.out.println("Cinsiyetinizi giriniz:");
        Scanner scanner=new Scanner(System.in);
        String cinsiyetGiris=scanner.next();


        Scanner scanner1=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz:");
        int yasGirisi=scanner1.nextInt();


        if (gender.equals("F") && age > 20 && age<50) {
            System.out.println("Kadın askerlik yaşındasınız!");
        } else if (gender.equals("M") && age > 18 && age<60 ) {
            System.out.println("Yaşınız giriniz");
            System.out.println("Erkek askerlik yaşındasınız");
        } else {
            System.out.println("Asker olma kriterine uymuyorsunuz \nLütfen Şubenize başvuru yapınız!!");
        }

    }
}

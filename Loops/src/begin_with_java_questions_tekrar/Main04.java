package begin_with_java_questions_tekrar;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        /*
        Write a program to find the factorial value of any number entered through the keyboard
         */

        Scanner scanner=new Scanner(System.in);
        int sayac=1;
        int number=0;
        int factoriel=1;


        System.out.println("Faktöryel hesaplamak için sayınızı giriniz: ");
        number=scanner.nextInt();

        while (sayac<=number){
            factoriel=factoriel*sayac;
            sayac++;

        }

        System.out.println(number+"!"+" = "+factoriel);
    }
}

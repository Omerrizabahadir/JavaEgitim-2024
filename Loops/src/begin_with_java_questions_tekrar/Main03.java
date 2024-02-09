package begin_with_java_questions_tekrar;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        /*
        Write a program that prompts the user to input a positive integer.
         It should then print the multiplication table of that number.
         Kullanıcıdan pozitif bir tamsayı girmesini isteyen bir program yazınız.
         Daha sonra bu sayının çarpım tablosunu yazdırmalıdır.
         */

        Scanner scanner = new Scanner(System.in);
        int sayac = 0;
        int number = 0;
        do {
            System.out.println("Lütfen pozitif bir tamsayı giriniz :");
            number = scanner.nextInt();
            sayac++;
            if (number <= 0) {
                System.out.println("Negatif sayı girdiniz tekrar giriniz");

            } else {
                System.out.println(number+"'lerin Çarpım Tablosu");
                for (int i = 1; i <= 10; i++) {
                    int sonuc = i * number;
                    System.out.println("------------------------");
                    System.out.println(i + " * " + number + " = " + sonuc);


                }


            }
        }
        while (number <= 0);

    }

}



package begin_with_java_questions_tekrar;

import java.util.Arrays;
import java.util.Scanner;

public class Solution11NegativePozitiveNumbers {
    /*
    Write a program to enter the numbers till the user wants and at the end
    it should display the count of positive, negative and zeros entered.
    Kullanıcının istediği kadar sayı girebilecek ve sonunda
    girilen pozitif, negatif ve sıfır sayılarını görüntüleyecek bir program
    yazınız.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int sayac = 0;
        int countZero = 0;
        int countNegative = 0;
        int countPozitive = 0;



        System.out.println("Sayılarınız pozitif mi, negatif mi, sıfır mı ? Hadi bulalım");
        System.out.println("Kaç adet sayı girmek istiyorsunuz?");
        number1 = scanner.nextInt();
        for (int i = 1; i <= number1; i++) {
            System.out.println(i + ". Sayıyı giriniz : ");
            number2 = scanner.nextInt();
            sayac++;

            if (number2 == 0) {
                countZero++;
            } else if (number2 > 0) {
               countPozitive++;
            } else {
               countNegative++;

            }

        }
        System.out.println("Pozitif saylar :"+countPozitive);
        System.out.println("Negatif saylar :"+countNegative);
        System.out.println("Sıfır :"+countZero);

    }

}



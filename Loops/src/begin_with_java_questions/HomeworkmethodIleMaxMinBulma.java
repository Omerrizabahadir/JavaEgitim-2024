package begin_with_java_questions;

import java.util.Scanner;

public class HomeworkmethodIleMaxMinBulma {
    // Kullanıcının 10 sayı girsin
    // ve sonunda programın girilen en büyük ve en küçük sayıları göstermesini sağlayacak
    // bir programı for  ve method kullanarak yazın.

    public static void main(String[] args) {

        buyukKucukHangisi();


    }
    public static void buyukKucukHangisi(){
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        int max = 0;
        int min = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the number!");
            userNumber = scanner.nextInt();


            if (userNumber>max) {
                max = userNumber;
            }
            if (userNumber < min) {
                min = userNumber;
            }
        }
        System.out.println("The Smallest number is :" + min);
        System.out.println("The Largestest number is :" + max);


    }
}

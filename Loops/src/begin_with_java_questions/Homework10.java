package begin_with_java_questions;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        // Kullanıcıdan iki sayı girmesini isteyen bir do-while döngüsü yazın.
        // Sayılar eklenmeli ve toplam görüntülenmelidir.
        // Döngü kullanıcıya işlemi tekrar yapmak isteyip istemediğini sormalıdır.
        // Eğer öyleyse döngü tekrarlanmalıdır; aksi takdirde sonlandırılmalıdır.


        Scanner scanner = new Scanner(System.in);
        boolean islemiTekrarYap = true;
        int toplam = 0;

        do {


            while (islemiTekrarYap) {
                System.out.println("birinci sayı girniz");
                int userNumber1 = scanner.nextInt();
                System.out.println("ikinci sayı girniz");
                int userNumber2 = scanner.nextInt();
                toplam = userNumber1 + userNumber2;
                System.out.println("toplam :" + toplam);

                // if (islemiTekrarYap1 == false) {
                System.out.println("işlem kapatılıyor");

                //islemiTekrarYap1=false;


            }


        } while (true);


    }
}
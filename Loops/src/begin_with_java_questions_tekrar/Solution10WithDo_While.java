package begin_with_java_questions_tekrar;

import java.util.Scanner;

public class Solution10WithDo_While {
    /*
     Write a do-while loop that asks the user to enter two numbers.
     The numbers should be added and the sum displayed.
     The loop should ask the user whether he or she wishes to perform
     the operation again. If so, the loop should repeat;
     otherwise it should terminate.

    Kullanıcıdan iki sayı girmesini isteyen bir do-while döngüsü yazın.
    Sayılar eklenmeli ve toplam görüntülenmelidir.
    Döngü kullanıcıya işlemi tekrar yapmak isteyip istemediğini sormalıdır.
    Eğer öyleyse döngü tekrarlanmalıdır; aksi takdirde sonlandırılmalıdır.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int sum = 0;
        char choice = 0;
        boolean isContinue = true;

        do {
            System.out.println("1. sayınızı giriniz");
            num1 = scanner.nextInt();
            System.out.println("2. sayınızı giriniz");
            num2 = scanner.nextInt();
            sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
            System.out.println("Do you want to continue? (y/n)");
            choice=scanner.next().charAt(0);
            if ((choice == 'y')) {

                isContinue = true;


            }else {
                isContinue=false;
            }

        } while (isContinue);

    }
}

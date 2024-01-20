package array_examples;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        /*kullanıcı 0 dışında bir sayı girinceye kadar sayı alacak sonra 0 girilince
        kullanıcının 0'a kadar girdiği tüm sayıları toplayan java kodu
        * */


        Scanner scanner=new Scanner(System.in);
        int userNumber;
        int toplam=0;

        while (true){
            System.out.println("sayı giriniz :");
            userNumber= scanner.nextInt();
            toplam+=userNumber;


            if (userNumber==0){
                System.out.println("0 girdiğiniz. 0'a kadarki sayılarınız toplanıyor!!!");
                break;
            }
        }

        System.out.println("Sayılarınızın toplamı :"+toplam);

    }

    }


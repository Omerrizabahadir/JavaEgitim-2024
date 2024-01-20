package return_methods;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        //Girilen sayıya kadar olan sayıların toplamını bulan
        //uygulamayı return type metodla yapınız

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int userNumber = scanner.nextInt();

        userNumber = girilenSayiToplami(userNumber);
        int toplam=userNumber;
        System.out.println("girilen sayıdan 1'e kadar olan sayıların Toplamı :"+toplam);

    }
    public static int girilenSayiToplami(int n){
       int toplam=0;
        for(int i=1;i<=n;i++){

           toplam+=i;
        }

return toplam;
    }
}

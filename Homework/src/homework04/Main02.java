package homework04;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {


        /*
        /*Taking numbers from users and adding numbers to the array
        kullanıcıdan kaç adet sayı gireceğini al ve sayı girdirt ve sonra bunları diziye ata
        sonra bu sayıların ortalamasını,toplamını, tek çift değerlerini yazan program
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz ");
        int number1 = scanner.nextInt();
        double[] dizi = new double[number1];


        int sayac = 0;

        do {
            System.out.println((sayac+1) + ". sayıyı giriniz :");
            double number2 = scanner.nextDouble();
            dizi[sayac] = number2;
            sayac++;
        } while (sayac < number1);

        double toplam = 0;
        double ortalama = 0;

        for (int i = 0; i < number1; i++) {
            toplam = toplam + dizi[i];
        }
            ortalama=toplam/number1;
        System.out.println("Dizinin sayıları toplamı : "+toplam);
        System.out.println("Dizinin sayıları ortalaması : "+ortalama);

        int sayac2=0,sayac3=0;
        for (int i=0;i<number1;i++){
            if (dizi[i]%2==0 || dizi[i]==0){
                System.out.println(dizi[i]+". değeri çifttir");
                sayac2++;
            }else {
                System.out.println(dizi[i]+". değeri tektir");
                sayac3++;
            }

        }
        System.out.println("Dizideki çift sayı :"+ sayac2+ " adet");
        System.out.println("Dizideki tek sayı :"+ sayac3+ " adet");
    }
}

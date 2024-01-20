package return_methods;

import java.util.Random;

public class ReturnTypeMethodExample01 {
    public static void main(String[] args) {


        int number = topla1(2, 90);     //topla1 metoduna göre returnün 1. yolu
        System.out.println("Toplam 1'in sonucu: " + number);


        int toplamSonuc2 = topla2(6, 9);   //yeni değişkenle topla 2 metodunu çağırdık return 2.yol
        System.out.println("Toplam 2'nin sonucu :" + toplamSonuc2);


    }

    public static int topla1(int num1, int num2) {
        int toplamSonuc1 = num1 + num2;
        return toplamSonuc1;

    }

    public static int topla2(int sayi1, int sayi2) {

        return sayi1 + sayi2;
    }


}

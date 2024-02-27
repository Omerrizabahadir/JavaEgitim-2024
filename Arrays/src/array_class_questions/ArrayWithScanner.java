package array_class_questions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithScanner {
    /*
    Kullanıcıdan 0 girene kadar hep sayılar alan ve
    0 girdiğinde o zamana kadar girdiği tüm sayıların toplamını ekrana yazdıran java kodunu yazınız.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum=0;

        while (true) {
            System.out.println("sayı giriniz");
            number = scanner.nextInt();

            if(number==0){
                System.out.println("0 sayısını girdiniz.Girdiğiniz sayıların toplamı hesaplanıyor");
                break;
            }
            sum+=number;
        }
        System.out.println("Toplam :"+sum);
    }
}

package begin_with_java_questions;

import java.util.Scanner;

public class Solution3 {
    //Write a program that prompts the user to input a positive integer.
    // It should then print the multiplication table of that number.
    //Kullanıcıdan pozitif bir tamsayı girmesini isteyen bir program yazınız.
    // Daha sonra bu sayının çarpım tablosunu yazdırmalıdır.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int number1=scanner.nextInt();

        int multiple=0;

        System.out.println(number1+" 'lerin çarpım tablosu");

       /* for (int i=1;i<=10;i++){
            multiple=number1*i;
            System.out.println(i+"*"+number1+"="+multiple);

        */

        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int sonuc=1;

        for (int i: numbers){
            sonuc=i*sonuc;
            System.out.println(sonuc);

        }


    }
}
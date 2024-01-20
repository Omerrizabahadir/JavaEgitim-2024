package begin_with_java_questions;

import java.util.Scanner;

public class Solution4 {
    //Klavyeden girilen herhangi bir sayının faktöriyel değerini bulan programı yazınız.
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("faktöryel hesaplanması için bir sayı giriniz!!!");
        int userNumber=scanner.nextInt();

        int fact=1;

        for (int i=1;i<=userNumber;i++){
            fact*=i;
        }
        System.out.println("Girdiğiniz sayının faktöryeli : "+fact);
    }

}

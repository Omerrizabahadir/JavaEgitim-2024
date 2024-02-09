package begin_with_java_questions_tekrar;

import java.util.Scanner;

public class Solution14FibonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;     //to hold number of terms
        int firstTerm=0,secondTerm=1,thirdTerm;


        System.out.println("Serinin terim sayısını girin :");
        number=scanner.nextInt();
        System.out.println(firstTerm+" "+ secondTerm+" ");


        for (int i=3;i<=number;i++){
            thirdTerm=firstTerm+secondTerm;
            System.out.println(thirdTerm+" ");
            firstTerm=secondTerm;
            secondTerm=thirdTerm;
        }
    }
}

package begin_with_java_questions;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
       // n'nin kullanıcı tarafından girildiği n terimli Fibonacci serisini yazdıran bir program yazın:
       // 0 1 1 2 3 5 8 13 24 .....
        Solution14 solution14=new Solution14();
        solution14.fibonacciSayisiAl();

    }
    public void fibonacciSayisiAl(){

        Scanner scanner=new Scanner(System.in);
        int userNumber;

        int firstTerm=0;
        int secondTerm=1;
        int thirdTerm;

        System.out.println("enter the number:");
        userNumber=scanner.nextInt();



        for (int i=3;i<=userNumber;i++){

            thirdTerm=firstTerm+secondTerm;
            System.out.println(thirdTerm+" ");
            firstTerm=secondTerm;
            secondTerm=thirdTerm;
        }
    }
}

package begin_with_java_questions;

import java.util.Scanner;

public class Solution04Mthod {
    public static void main(String[] args) {

        Solution04Mthod solution04Mthod=new Solution04Mthod();
        solution04Mthod.faktoryelHesaplama();
    }

    public int faktoryelHesaplama() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktöryel hesaplamak için bir sayı giriniz!");
        int userNum = scanner.nextInt();
        int fact = 1;


        for (int i = 1; i <= userNum; i++) {
            fact *= i;
        }
        System.out.println(userNum +" ! ="  + fact);
        return fact;
    }
}

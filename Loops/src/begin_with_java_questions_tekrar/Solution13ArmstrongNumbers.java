package begin_with_java_questions_tekrar;

public class Solution13ArmstrongNumbers {
    public static void main(String[] args) {
        /*
        Write a program to print out all Armstrong numbers between 1 and 500.
        If sum of cubes of each digit of the number is equal to the number itself,
        then the number is called an Armstrong number.
        For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
         */

        int digit1;     //Birler basamağını tutacak
        int digit2;     //Onlar basamağını tutacak
        int digit3;     //Yüzler basamağını tutacak

        for (int number = 0; number <= 500; number++) {
            int temp = number;

            digit1 = temp % 10;

            temp = temp / 10;
            digit2 = temp % 10;

            temp = temp / 10;
            digit3 = temp % 10;

            if (digit1 * digit1 * digit1 + digit2 * digit2 * digit2 + digit3 * digit3 * digit3 == number && !(number==0) && !(number==1) ) {
                System.out.println(number);
            }
        }


    }
}

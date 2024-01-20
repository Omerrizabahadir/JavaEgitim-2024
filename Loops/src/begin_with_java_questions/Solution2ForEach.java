package begin_with_java_questions;

public class Solution2ForEach {
    //Write a program to calculate the sum of first 10 natural number.
    public static void main(String[] args) {

        int []array = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum=0;

        for (int number :array){
            sum =number+sum;
            System.out.println(sum);
        }

    }
}

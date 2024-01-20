package array_examples;

import java.util.Arrays;

public class MinMaxElementsInArray01 {
    //Given an array, write functions to find the minimum and maximum elements in it.
    public static void main(String[] args) {
        int a[]={1,423,6,46,34,23,13,53,4};

        Arrays.sort(a);
        System.out.println("Min a : "+a[0]+"\n"+"Max a :"+a[a.length-1]);

    }
}

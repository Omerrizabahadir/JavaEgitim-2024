package method_homework;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArrayWithMethods02 {
    public static void main(String[] args) {
        ReversedArrayWithMethods02 reversedArrayWithMethods02 = new ReversedArrayWithMethods02();
        int arrayLength = reversedArrayWithMethods02.getArrayLengthFromUser();
        int[] array = new int[arrayLength];
        array = reversedArrayWithMethods02.getArrayNumbersFromUsers(array);
        int[] reversedArray=array;
        reversedArrayWithMethods02.reversedTheArrayNumbers(reversedArray);
    }
    public int getArrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç elemanlı dizi oluşturmak istiyorsunuz?");
        int arraylength = scanner.nextInt();
        return arraylength;
    }
    public int[] getArrayNumbersFromUsers(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<array.length; i++) {
            System.out.println("sayı giriniz :");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }
    public int[] reversedTheArrayNumbers(int[] reversedArray) {
        System.out.println("Dizinin Tersi :");
        for (int i = reversedArray.length-1; i >= 0; i--) {
            System.out.println(i+". elemanı :"+reversedArray[i]);
        }
        return reversedArray;
    }
}

package geeks_for_geeks_method_examples_solutions;

public class ReverseTheArray {
    //diziyi tersine çevirme
    //Giriş: arr[] = {1, 2, 3}
    //Çıkış: arr[] = {3, 2, 1} gibi
    /* Function to reverse arr[] from
    start to end*/
    public static void main(String[] args) {
        int array[] = {1, 2, 3,4,5,6};
        System.out.println("Given Array is :");
        printArray(array, 6);
        reverseArray(array, 0, 5);
        System.out.println("\nReversed array is : ");
        printArray(array, 6);

    }

    public static void reverseArray(int[] array, int start, int end) {

        int temp;

        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;

        }
    }

    public static void printArray(int array[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");


        }

    }
}
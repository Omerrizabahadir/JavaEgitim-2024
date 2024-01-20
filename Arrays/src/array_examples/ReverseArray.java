package array_examples;

// Diziyi tersine çevirme
public class ReverseArray {

    public static void main(String[] args) {
        ReverseArray reverseArray=new ReverseArray();
        System.out.println("Given Array is :");
        int[] a = {1, 2, 3, 4, 5, 6};
        reverseArray.printArray(a, 6);
        System.out.println("\nReverse array is:");
        reverseArray.printArray(a,6);


    }

    public  int[] reverseTheArray(int[] array, int start, int end) {
        int temp;

        while (start < end) {
            for (int i = 0; i < array.length; i++) {
                temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end++;

            }

        }
        return array;
    }

    public void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

}

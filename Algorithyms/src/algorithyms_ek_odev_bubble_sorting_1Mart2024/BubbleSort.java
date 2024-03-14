package algorithyms_ek_odev_bubble_sorting_1Mart2024;

public class BubbleSort {

    int[] numbersArray = {19, 1, 2, 0, 3, 10, -13, 9, 6, 4, 7};

    public void bubbleSort(int numbersArray[], int n) {

        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (numbersArray[i] > numbersArray[i + 1]) {
                int temp = numbersArray[i];
                numbersArray[i] = numbersArray[i + 1];
                numbersArray[i + 1] = temp;
            }
        }
            bubbleSort(numbersArray,n-1);
    }

    public void display(int numberArray[]) {  //diziyi göster

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(numberArray[i] + "");
        }
    }
}

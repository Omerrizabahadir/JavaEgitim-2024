package algorithyms_ek_odev_bubble_sorting_1Mart2024;

public class Main {
    public static void main(String[] args) {

        BubbleSort bubbleSort=new BubbleSort();
        int [] numbersArray=bubbleSort.numbersArray;

        bubbleSort.bubbleSort(numbersArray, numbersArray.length);
        bubbleSort.display(numbersArray);


    }
}

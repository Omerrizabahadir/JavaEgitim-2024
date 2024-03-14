package algorithyms_bubbleSorting_of_favtutor;

public class Main {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] arr = sort.arr;

        sort.bubbleSort(arr, arr.length);
        sort.display(arr);

    }
}

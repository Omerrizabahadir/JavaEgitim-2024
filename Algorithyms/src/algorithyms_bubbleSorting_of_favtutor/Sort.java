package algorithyms_bubbleSorting_of_favtutor;

public class Sort {
    int arr[] = {6, 4, 5, 12, 2, 11, 9};


    public void display(int arr[]) {

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    public void bubbleSort(int arr[],int n){
        if (n==1) {
            return;
        }
            for (int i=0;i<n-1;i++) {
                if (arr[i] > arr[i + 1]) {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                }
            }
            bubbleSort(arr,n-1);
        }
    }


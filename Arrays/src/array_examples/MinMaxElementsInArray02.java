package array_examples;

public class MinMaxElementsInArray02 {
    public static void main(String[] args) {
        int arr[] = { 12, 1234, 45, 67, 1 };

        int n=arr.length;
        System.out.println("Min element of the array : "+getMin(arr,n));
        System.out.println("Max element of the array : "+getMax(arr,n));

    }

    public static int getMin(int array[], int n) {
        int res = array[0];

        for (int i=1;i<n;i++)
            res=Math.min(res,array[i]);
            return res;

        }

    public static int getMax(int array[],int n){
        int res=array [0];
        for(int i=1;i<n;i++)
            res=Math.max(res,array[i]);
            return  res;


        }

    }



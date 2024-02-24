package algorithyms_homeworh04_max_longest_subarray;

public class MaxLongestSubArray {
    public static void main(String[] args) {
        int [] array=new int[10];
        int [] subArray={5,1,2,2,4,4,5,1};

        int maxLenghth=0;

        for (int a:subArray){
            array[a]++;
            maxLenghth=Math.max(maxLenghth,array[a]);
        }
        for (int i=0;i<array.length;i++){
            if (array[i]==maxLenghth){
                System.out.println(i);
break;
            }
        }
    }
}

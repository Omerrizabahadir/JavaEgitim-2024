package array_with_methods;

public class Array {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4};
        int []newDizi=diziOlustur(dizi);

        for (int d:newDizi){
            System.out.println(d);

        }
        System.out.println("Dizinin en büyük elemanı :"+maxBul(dizi));

    }
    public static int[] diziOlustur(int[] dizi){

       for (int i=0;i<dizi.length;i++){

       }
        return dizi;
    }
    public static int maxBul(int[]dizi){
        int max;
        max=dizi[3];


        return max;
    }
}

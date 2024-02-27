package claas_studies;

public class ArraySumAverageOfOddAndEvenNumbers {
    public static void main(String[] args) {
        int[] array = {-2, -9, 0, 5, 12, -25, 22, 9, 8};
        int sum = 0;
        int sayac1=0;
        int sayac2=0;
        int sumEven=0;
        int sumOdd=0;


        for (int i = 0; i < array.length; i++) {

            if (array[i]%2==0){

                System.out.println(array[i]+": çift sayıdır");
                sumEven+=array[i];
                sayac1++;

            }else {

                System.out.println(array[i]+" :tek sayıdır");
                sumOdd+=array[i];
                sayac2++;
            }
            sum = array[i] + sum;

        }


        double average = sum / array.length;
        System.out.println(sum);
        System.out.println(average);
        System.out.println("tek sayıların toplamı :"+sumOdd);
        System.out.println("çift sayıların toplamı :"+sumEven);
        System.out.println(sayac1+ " adet "+"çift");
        System.out.println(sayac2+ " adet "+"tek");


    }

}

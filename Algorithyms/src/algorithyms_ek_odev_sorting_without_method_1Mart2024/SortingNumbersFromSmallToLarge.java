package algorithyms_ek_odev_sorting_without_method_1Mart2024;

public class SortingNumbersFromSmallToLarge {

    /*{1,2,3,10,6,4,7} bu diziyi küçükten büyüğe hiçbir java metodu kullanmadan
     döngü ve algoritma ile sıralayınız

     */
    int[] numbersArray = {19, 1, 2, 0, 3, 10, -13, 9, 6, 4, 7};
    int number = 0;

    public int getNumbers() {

        System.out.println("Dizinin sırasız hali : ");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i]);
            System.out.print(",  ");
            for (int j = 0; j < numbersArray.length; j++) {

                if (numbersArray[i] <= numbersArray[j]) {
                    number = numbersArray[i];
                    numbersArray[i] = numbersArray[j];
                    numbersArray[j] = number;
                }
            }
        }
        return number;
    }

    public void sortArrayNumbersFromSmallToBig() {

        System.out.println("\nDizinin sıralanmış hali : ");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i]);
            System.out.print(",  ");
        }
    }
}
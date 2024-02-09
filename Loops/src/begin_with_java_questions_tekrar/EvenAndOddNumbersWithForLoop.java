package begin_with_java_questions_tekrar;

public class EvenAndOddNumbersWithForLoop {
    public static void main(String[] args) {
        /*Write a program that reads a set of integers,
         and then prints the sum of the even and odd integers.

         Bir dizi tam sayıyı okuyan ve daha sonra çift ve
         tek tam sayıların toplamını yazdıran bir program yazın.
         */

        int[] array = {1, 5, 7, 89, 100, 112};
        int sayac = 0;
        int sayac2 = 0, sayac3 = 0;
        for (int newArray : array) {
            System.out.print(newArray);
            sayac++;


            if (newArray % 2 == 0) {
                System.out.println("--> " + sayac + ". sayı çift");
                sayac2++;
            } else {
                System.out.println(" -->" + sayac + ". sayı" + " tek");
                sayac3++;
            }

        }
        System.out.println("Dizide " + sayac2 + " adet " + " çift sayı vardır");
        System.out.println("Dizide " + sayac3 + " adet " + " tek sayı vardır");
    }
}

package begin_with_java_questions_tekrar;

public class EvenAndOddNumbersWithDowhileLoop {
    public static void main(String[] args) {
        /*
        Write a program that reads a set of integers,
        and then prints the sum of the even and odd integers.
         */

        int[] array = {1, 5, 7, 89, 100, 112};
        int num;
        int sayac = 0;
        int sayac2 = 0;
        int sayac3 = 0;


        do {
            num = array[sayac];
            sayac++;

            if (num % 2 == 0) {
                System.out.println(sayac + ". sayı " + num + " çifttir");
                sayac2++;

            } else {
                System.out.println(sayac + " . sayı " + num + " tektir");
                sayac3++;


            }

//döngüyü kırmak için ekledim
            if (sayac == array.length) {
                System.out.println("Dizide " + sayac2 + " adet çift sayı vardır");
                System.out.println("Dizide " + sayac3 + " adet tek sayı vardır");

                break;
            }


        } while (num >= sayac);


    }
}

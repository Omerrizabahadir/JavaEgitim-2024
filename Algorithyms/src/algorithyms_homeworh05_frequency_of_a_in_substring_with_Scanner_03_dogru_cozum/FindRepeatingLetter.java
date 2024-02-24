package algorithyms_homeworh05_frequency_of_a_in_substring_with_Scanner_03_dogru_cozum;

import java.util.Arrays;
import java.util.Scanner;

public class FindRepeatingLetter {
    Scanner scanner = new Scanner(System.in);
    String repeatedstring ;
    int repeat;


    int sayac = 0;
    int characterSayaci = 0;

    public String getLettersFromUser() {

        System.out.println("Lütfen a,b,c harfleriyle bir kelime yazınız");
        repeatedstring = scanner.next();

        return null;
    }
    public int getWordFromUser() {
        System.out.println("Kaç kere yazılsın");
        repeat = scanner.nextInt();
        return 0;
    }
    public int writeLetterRepeatevely() {
        char repeatedChar[] = repeatedstring.toCharArray();
        int stringHarf = repeatedChar.length;
        char harfler[] = new char[repeat];

        for (int i = 0; i < repeat; i++) {
            harfler[i] = repeatedChar[sayac];
            if (repeatedChar[sayac] == 'a') {
                characterSayaci++;
            }
            sayac++;
            if (sayac == stringHarf) {
                sayac = 0;
            }
        }
        System.out.println("Harflerin tekrarı : " + Arrays.toString(harfler));
        System.out.println("A harfi toplamda " + characterSayaci + " kere tekrar etmiştir");

        return repeat;
    }
}


package algorithym_odev05_tekrar_eden_karakterler_;

import java.util.Scanner;
//Önce sayı alıp saonra kelime istiyoruz.

public class FindRepeatingLetter {
    public String getWordFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç harfli bir kelime oluşturmak istersiniz?");
        scanner.nextInt();
        System.out.println("a,b,c harfleriyle bir kelime yazınız");
        String word = scanner.next();

        return word;
    }

    public int findRepeatingLetter(String word) {
        char letter = 'a';
        char[] letters = word.toCharArray();
        int numberOfA = 0, numberOfB = 0, numberOfC = 0;

        for (int i = 0; i < word.length(); i++) {
            if (letters[i] == 'a') {
                numberOfA++;
            } else if (letters[i] == 'b') {
                numberOfB++;
            } else if (letters[i] == 'c') {
                numberOfC++;
            }
        }

        System.out.println(" a harfinden " + numberOfA + " adet vardır");
        System.out.println(" b harfinden " + numberOfB + " adet vardır");
        System.out.println(" c harfinden " + numberOfC + " adet vardır");
        return numberOfA;
    }
}

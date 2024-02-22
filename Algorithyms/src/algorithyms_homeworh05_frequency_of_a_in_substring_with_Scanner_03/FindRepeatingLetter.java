package algorithyms_homeworh05_frequency_of_a_in_substring_with_Scanner_03;

import java.util.Scanner;

public class FindRepeatingLetter {
    public String getWordFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç harfli bir kelime oluşturmak istersiniz?");
        int wordLength = scanner.nextInt();
        System.out.println("a,b,c harfleriyle bir kelime yazınız");
        String word = scanner.next();

        return word;
    }

    public int findRepeatingLetter(String word) {
        char letter = 'a';
        char[] letters = word.toCharArray();
        int numberOfA = 0, numberOfB = 0, numberOfC = 0;

        for (int i=0;i<word.length();i++){
            if (letters[i] =='a'){
                numberOfA++;
            } else if (letters[i]=='b') {
               numberOfB++;
            } else if (letters[i]=='c') {
                numberOfC++;
            }
        }

        System.out.println(" a harfinden "+numberOfA+" adet vardır");
        System.out.println(" b harfinden "+numberOfB+" adet vardır");
        System.out.println(" c harfinden "+numberOfC+" adet vardır");
        return numberOfA;
    }
}

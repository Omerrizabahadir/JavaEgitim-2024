package algorithyms_homeworh05_repeated_character_length_with_Scanner_01.way;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class WriteRepeatedLetterWay01 {
    Scanner scanner=new Scanner(System.in);
    String repeatedWord;
    int  repeat;

    int counter=0;
    int characterACount=0;


    public String takingWordFromUser(){
        System.out.println("a,b,c harflerini kullanarak bir kelime giriniz");
        repeatedWord=scanner.next();

        return repeatedWord;
    }
    public int takingNumberFromUser(){
        System.out.println("Kaç kere tekrar edileceğini belirten bir sayı giriniz");
        repeat=scanner.nextInt();

        return repeat;
    }
    public int findGivenLettersRepating(){
        char[] repeatedLetter= repeatedWord.toCharArray();
        int repeatedWordToLetters=repeatedLetter.length;
        char[] letters=new char[repeat];

        for (int i=0;i<repeat;i++){
            letters[i]=repeatedLetter[counter];
            if (repeatedLetter[counter]=='a'){
                characterACount++;
            }
            counter++;
            if (counter==repeatedWordToLetters){
                counter=0;
            }
        }
        System.out.println("Harflerin tekrarı : "+ Arrays.toString(letters));
        System.out.println("a harfi "+ characterACount+" kere tekrar etmiştir");
        return repeat;
    }
}

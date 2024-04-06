package Map_Coolection_examples_02;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class GFG {
    /*
    Örnek 1: Burada,
    bir dizeyi,
    dizenin kelimeleri olarak anahtarlar ve her kelimenin uzunluğu olarak
    değer olacak şekilde bir Map Collection'a dönüştüreceğiz .

     */
    public static void main(String[] args) {

        String input = "Geeks for Geek is good";
        System.out.println(toMap(input));

    }
    /*
    Aşağıdaki metot ile maindeki String input'umun kelimelerini ayıır ve haritala dedim
    içindeki kelimeleri ayıracak ve hepsinin kaç harfli olduğunu yazacak
     */

    public static Map toMap(String input) {
        Map<String, Integer> lengthMap = Arrays
                .stream(input.split(" "))
                .collect(Collectors.toMap(p -> p, p -> p.length()));
        return lengthMap;
    }
}

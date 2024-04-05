package java8_homework_03;

import java.util.List;
import java.util.stream.Collectors;

public class FindALetterInGivenList {
    /*
    3-Bir liste içerisinde verilen bir koşulu sağlayan tüm öğeleri bulan bir program yazın.
    Örneğin, bir liste içerisinde "a" harfi içeren tüm stringleri bulun.
     */
    public static void main(String[] args) {
        List<String> listOfWords = List.of("anahtar", "armada", "sarnıç", "masa", "bisiklet", "misal");

        String finfLetterInWord = String.valueOf(listOfWords
                .stream()
                .filter(e -> e.contains("as"))
                .collect(Collectors.toList()));

        System.out.println(finfLetterInWord);
    }
}

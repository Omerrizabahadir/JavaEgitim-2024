package java8_homework_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CalculateLengthOfTheWords {
    /*
    9-Bir String listesi alarak her bir stringin uzunluğunu hesaplayan
    ve sonuçları bir başka liste olarak döndüren bir fonksiyon yazın.
     9-Write a function that takes a list of Strings,
     calculates the length of each string,
     and returns the results as another list.
     */
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("ANKARA");
        liste.add("İSTANBUL");
        liste.add("ŞANLIURFA");
        liste.add("ADIYAMAN");
        liste.add("BOLU");
        liste.add("AYDIN");

        List<Integer> result = stringUzunlukHesapla(liste);
        System.out.println(liste);
        System.out.println(result);


    }

    public static List<Integer> stringUzunlukHesapla(List<String> stringListe) {

        List<Integer> uzunluk = new ArrayList<>();
        for (String str : stringListe) {
            uzunluk.add(str.length());
        }
        return uzunluk;
    }

}

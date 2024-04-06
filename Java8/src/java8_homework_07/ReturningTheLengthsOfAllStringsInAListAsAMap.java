package java8_homework_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReturningTheLengthsOfAllStringsInAListAsAMap {
    /*
    Bir liste içerisindeki tüm stringlerin uzunluklarını
    bir harita (Map) olarak döndüren bir programı yazınız .
     */

    public static void main(String[] args) {


        List<String> listOfFruits = Arrays.asList("muz", "elma", "armut", "çilek");

        Map<String, Integer> mapList = listOfFruits.stream()
                .collect(Collectors.toMap(p -> p, p -> p.length()));

        System.out.println(mapList);


    }
}


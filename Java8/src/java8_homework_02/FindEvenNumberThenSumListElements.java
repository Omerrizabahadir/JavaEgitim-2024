package java8_homework_02;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindEvenNumberThenSumListElements {

    /*
    2-Verilen bir dizi sayı içerisinden
    çift sayıları filtreleyerek toplamını bulan bir program yazın.
     */

    public static void main(String[] args) {

        List<Integer> numbersList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 12);

        int sumOfEvenNumbers = numbersList
                .stream()
                .filter(i -> i % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println("Listedeki çift sayıların toplamı : " + sumOfEvenNumbers);


    }

}


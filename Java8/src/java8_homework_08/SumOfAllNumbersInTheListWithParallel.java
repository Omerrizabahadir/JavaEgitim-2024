package java8_homework_08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfAllNumbersInTheListWithParallel {
    public static void main(String[] args) {
        /*
        8-Bir liste içerisindeki tüm sayıların toplamını hesaplayan bir program yazın
        ve bu işlemi paralel olarak gerçekleştirin.
         */


        List<Integer> listOfNumbers = List.of(12, 2, 34, 6, 0, 9);
        int sumOfNumbers=listOfNumbers.parallelStream()
                .reduce(0,(a,b)->a+b);
        System.out.println("Sum of numbers to the List : "+sumOfNumbers);

    }
}

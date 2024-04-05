package java8_homework_01;

import java.util.Arrays;

public class SortedListFromSmallerToBigger {
    public static void main(String[] args) {

        Arrays.asList(1,23,30,4,55,6,77,89,0)
                .stream()
                .sorted()
                .forEach(System.out::println);


    }
}

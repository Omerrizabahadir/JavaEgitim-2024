package java8_homework_01;

import java.util.List;
import java.util.stream.Collectors;

/*
1- Verilen bir dizi sayıyı küçükten büyüğe sıralayan bir program yazın.
Bu programı lambda ifadelerini kullanarak gerçekleştirin.
 */
public class SortedListFromSmallerToBiggerWithUsingLambdaExpression {
    public static void main(String[] args) {
        List<Integer> numersOfList = List.of(1, 23, 30, 4, 55, 6, 77, 89, 0);

        System.out.println("Lambda kullanarak sayıların sıralaması : ");
        List<Integer> sortedNumbers = numersOfList
                .stream()
                .sorted((number1, number2) -> number1.compareTo(number2))
                .collect(Collectors.toList());
        sortedNumbers.forEach(System.out::println);
    }
}

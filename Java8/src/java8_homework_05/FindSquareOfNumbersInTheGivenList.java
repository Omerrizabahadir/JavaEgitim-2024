package java8_homework_05;

import java.util.List;

public class FindSquareOfNumbersInTheGivenList {
    /*
    5-Bir liste içerisindeki tüm sayıların karesinin toplamını bulan bir program yazın.
     */
    public static void main(String[] args) {
        List<Integer> listOfNumbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int squareOfListsNumbers = listOfNumbers
                .stream()
                .map(i -> i * i)
                .filter(i -> i > 0)
                .reduce(0, Integer::sum);

        System.out.println("Listenin elemanlarının karelerinin toplamı : "+squareOfListsNumbers);
    }
}

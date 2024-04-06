package java8_homework_04_2;

import java.util.Optional;

import static java8_homework_04_2.FindStringElementsOfIndex.getElementIndex;

public class Main2 {
    public static void main(String[] args) {


        String[] array = {"oppo", "lg", "apple", "samsung", " "};
        int index =1;

        Optional<String> result = getElementIndex(array, index);

        if (result.isPresent()) {
            System.out.println(" Belirtilen index dizinin elemanı : " + result.get() + " dır.");
        } else {
            System.out.println(" Belirtilen index dizinin sınırları dışındadır!");
        }


    }
}

package java8_homework_04_2;

import java.util.Optional;

/*
   4-Bir metot, bir string dizisi alır
   ve bu dizinin belirli bir indexindeki elemanı döndürür.
   Ancak, belirtilen index dizinin sınırlarının dışında ise,
   metot null yerine bir Optional nesnesi döndürmelidir. Bu metodu yazın.
    */


public class FindStringElementsOfIndex {

    public static Optional<String> getElementIndex(String[] arr, int index) {

        if (index >=0 && index < arr.length) {

            return Optional.of(arr[index]);
        } else {

            return Optional.empty();
        }


    }
}

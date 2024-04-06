package java8_homework_04_1;

import java.util.Optional;

public class Main {

   /*
   4-Bir metot, bir string dizisi alır
   ve bu dizinin belirli bir indexindeki elemanı döndürür.
   Ancak, belirtilen index dizinin sınırlarının dışında ise,
   metot null yerine bir Optional nesnesi döndürmelidir. Bu metodu yazın.
    */

    public static void main(String[] args) {

        String[] stringArray = {"apple", "samsung", "oppo"," "};

        int index = 4;

        Optional<String> result = diziIndexiniAl(stringArray, index);

        if (result.isPresent()) {
            System.out.println(" Belirtilen index'in elemanı : " + result.get());
        } else {
            System.out.println(" Belirtilen index dizi sınırlarının dışındadır!");
        }
    }

    public static Optional<String> diziIndexiniAl(String[] dizi, int index) {

        if (index >= 0 && index < dizi.length) {
            return Optional.of(dizi[index]);
        }

        return Optional.empty();
    }

}

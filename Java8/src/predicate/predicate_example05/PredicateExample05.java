package predicate.predicate_example05;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample05 {
    public static void main(String[] args) {

         /*SORU: List<String> olsun
        bunun içinde String isimler olsun
        ve length'i  >4 olan
        ve baş harfi a olan string'leri filtreleyip ayrı bir List'e
        atıp onu da ekrana yazalım.
         */

        //burada da 2 adet  Predicate oluşturup listeye atıcaz
        //bu kötü ama gör diye yazdık

        Predicate<String>nullCheckPredicate= value -> value.startsWith("a");
        Predicate<String>lengthCheckPredicate= value -> value.length()>4;

        //predicate'leri birleştir
        Predicate<String>andPredicate=nullCheckPredicate.and(lengthCheckPredicate);


        List<String>myList=List.of("necla","yaren","aslıhan","veli","aliye","karatas");
        List<String>filteredList=myList.stream().filter(andPredicate).toList();
        System.out.println(filteredList);

        //predicate true false yani boolean döner
        String temp1 = null;
        String temp2 = "java8";
        String temp3 = "hasan";
        String temp4 = "aab";
        System.out.println("Temp 2 a ile başlıyor mu ve 4 harften büyük mü ? "+andPredicate.test(temp2));
        System.out.println("Temp 4 a ile başlıyor mu ve 4 harften büyük mü ? "+andPredicate.test(temp4));

    }
}

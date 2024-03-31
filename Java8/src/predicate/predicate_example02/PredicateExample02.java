package predicate_examples02;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample02 {
    public static void main(String[] args) {

        List<String> myList = List.of("java8", "hasan", "kadir", "demircan", "hello");
        //java 9 önerilmez internette görebilirsin diye yazdık
        System.out.println("java 9 ile yazılan önerilmeyen çıktısı :");
        Stream<String> myStream = myList.stream();
        Predicate<String> predicate1 = element -> element.length() > 5;
        myStream.filter(predicate1).forEach(System.out::println);


        //kısa ve önerilen budur
        System.out.println("önerilenin çıktısı :");
        myList.stream().filter(predicate1).forEach(System.out::println);

        //ilerde bu olacak daha güzel .filter(predicate1) yerine karşılığı olan element -> element.length()>5 yazılacak
        System.out.println("önerilenin çıktı ilerde göreceğimizin çıktısı : ");
        myList.stream().filter(element -> element.length() > 5).forEach(System.out::println);

        /*
        Şimdi myList teki isimlerin 5 harfli olanlarını yazdıralım
         */
        //yeni liste oluşturmalıyım
        System.out.println("liste oluşturup yapılanın çıktısı :");
        List<String> nameSizeIs5 = myList.stream().filter(element -> element.length() == 5).toList();
        System.out.println("------");
        nameSizeIs5.forEach(System.out::println);

        //java 8 den önce nasıl yazıyorduk foreach 'i
        System.out.println("java 8 öncesi fo ilke bastırma :");
        for ( String  name: nameSizeIs5){
            System.out.println(name);

        }

    }
}

package stream_apı.teminal_operations_Pattern_compile_splitAsStream_collect;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TerminalExample08 {
    public static void main(String[] args) {

        String frenchCounting = "en:deux:trois:quatre";

        /*Bu yapıyı compile ile listenin içine almak istersen
        mutlaka Pattern.compile demelisin
        Ör: Stream.compile veya List.compile yok
         */

        List<String> list1 = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                //.collect(Collectors.toList());//java 16 öncesi için collect böyle kullanılır
                .toList();  //java 16 sonrasında collect 'e gerek yok direkt toList kullan
        System.out.println(list1);


        Set<String> list2 = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .collect(Collectors.toSet());

        System.out.println(list2);



        Map<String, Integer> nameLength = List.of("Arnold", "Alois", "Schwarzenegger")
                .stream()
                .collect(Collectors.toMap(name -> name, String::length));

        System.out.println(nameLength);

    }
}

package stream_apı.teminal_operations.reduce_example;

import java.util.List;

public class TerminalExample07 {
    public static void main(String[] args) {
        List<String> list1 = List.of("w", "o", "l", "f", "__");
        String text = list1.stream()
                .reduce("x", (a, b) -> a + b)
                .trim();

        System.out.println(text);
        System.out.println("---------------");

        String text1 = list1.stream()
                .reduce("x", (a, b) -> a + b + "__")
                .concat("y")  // y'yi dizinin elemanlarının sonuna ekler
                .trim();    //metnin sonunda ve başında yer alan boşlukları yok ederken kelime aralarındaki boşluklara dokunmaz. Bu metod özellikle kullanıcıların formlar ile gönderdiği verilerde (isim, e-posta vs.) veritabanına kayıt etmeden önce kullanılmalıdır.
        System.out.println(text1);


    }
}

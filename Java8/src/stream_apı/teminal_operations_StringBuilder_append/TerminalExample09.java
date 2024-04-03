package stream_apı.teminal_operations_StringBuilder_append;

import java.util.List;

public class TerminalExample09 {
    public static void main(String[] args) {
        /*
        temel olarak metinsel ifadeleri birleştirmek için kullanılan bir sınıftır.
        StringBuilder nesneleri temel olarak String değişkeninin sahip olduğu metot ve özelliklere sahiptir.
        Bunun yanında özel olarak
        Append(),
        AppendFormat() ve
        AppendLine()
        adlarında üç metodu daha vardır.
        Append()
        Append kelime anlamıyla eklemek anlamına gelmektedir.
        Bu metodla StringBuilder nesnesinin içeriğinin sonuna yeni veri eklenebilir.
        StringBuilder sbldr = new StringBuilder("isim");
        sbldr.Append(" soyisim");
         */
        StringBuilder word = List.of("w", "o", "l", "f")
                .stream()
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word);
    }
}

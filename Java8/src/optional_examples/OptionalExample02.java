package optional_examples;

import java.util.Optional;

public class OptionalExample02 {
    public static void main(String[] args) {



        /* NullPointerException almamak için ofNullable kullan
        .ofNullable(null); kullanınca içi null olsa bile hata vermez boş çıktı verir

         */
        Optional<String>nullStr2=Optional.ofNullable(null);

        nullStr2.ifPresent(System.out::println);


        System.out.println("üst tarafı hata vermez ama boş basılır***********");


        System.out.println("Optional.of(null) -->NullPointerException hatası verir ");

        Optional<String>nullStr1=Optional.of(null);
        boolean tf=nullStr1.get().equals("value");

    }
}

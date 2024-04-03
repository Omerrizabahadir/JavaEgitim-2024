package optional_examples;

import java.util.List;
import java.util.Optional;

public class OptionalExample01 {
    public static void main(String[] args) {
        /*
        Optional sınıfını kullanmamızın amacı;
        sadece NULLPOINTEREXCEPTION hatasını almamak.
         */


        Optional<String> emptyOptional=Optional.empty();

        Optional<String>optional1=Optional.of("value");

        System.out.println(optional1);
        System.out.println(optional1.get());
        System.out.println(emptyOptional);

    }
    public Optional<String>doSomething(String value){


        return Optional.empty();
    }
}

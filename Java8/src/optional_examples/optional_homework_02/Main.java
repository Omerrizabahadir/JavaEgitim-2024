package optional_examples.optional_homework_02;

import java.util.Optional;

public class Main {

    String name = null;

    public static void main(String[] args) {
        Main main = new Main();

        String result1 = Optional.ofNullable(main.name)
                .orElse("Ömer");
        System.out.println("Name : " + main.name);

        System.out.println("****************");

        Optional result2=Optional.empty();
                result2.ifPresent(System.out::println);  //hata vermez

        System.out.println("------------------");

        String result3=Optional.of(main)
                .map(n->n.name)
                .orElseGet(()->"Onur");

        System.out.println("Name : "+result3);
    }
}

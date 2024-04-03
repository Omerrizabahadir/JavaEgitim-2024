package stream_apı.teminal_operations;

import java.util.ArrayList;
import java.util.List;

public class TerminalExample04 {
    public static void main(String[] args) {
        List.of("Monkey", "Gorilla", "Bonobo")
                .stream()
                .forEach(System.out::println);

        System.out.println("********************");
        List<String> animalList = new ArrayList<>();
        List.of("Monkey", "Gorilla", "Bonobo").stream()
                .forEach(e -> {
                    if (e.length() > 6) {
                        animalList.add(e + "'s");
                    }
                });
        System.out.println(animalList);

        System.out.println("-----------------------");


        List<String> animalList2=List.of("Monkey", "Gorilla", "Bonobo")
                .stream()
                .filter(e->e.length()>6)
                .map(e->e.concat("'s"))
                .toList();

        System.out.println(animalList2);
    }
}

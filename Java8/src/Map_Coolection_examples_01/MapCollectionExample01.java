package Map_Coolection_examples_01;

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapCollectionExample01 {
    public static void main(String[] args) {

        Person person1 = new Person("bob", 34);
        Person person2 = new Person("bob", 43);
        Person person3 = new Person("mary", 84);
        Person person4 = new Person("john", 12);
        Person person5 = new Person("bob", 22);


        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        System.out.println("Person List : " + personList);


        Stream<Person> personStream = personList.stream();
        //Map arayüzünde stream çıkmıyor. Bu nedenle üstte Stream açtık.personStream i çektik
        Map<String, List<Integer>> result = personStream
                .collect(Collectors.groupingBy(p -> p.getName(), Collectors.mapping(e -> e.age, Collectors.toList())));

        System.out.println("Mapping result : " + result);


    }
}
package optional_homework_03;

import java.util.Optional;

public class Main {
    Integer number= null;


    public static void main(String[] args) {

        Main main=new Main();
        Integer result1=Optional.ofNullable(main.number)
                .orElse(0);

        System.out.println("Number : "+result1);

        System.out.println("******************");


        Integer result2=Optional.of(main)
                .map(e->e.number)
                .orElseGet(()->1);
        System.out.println("Number : "+result2);
    }
}

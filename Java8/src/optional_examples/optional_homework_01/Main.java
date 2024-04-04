package optional_examples.optional_homework_01;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Toyota","Corolla","White", 2020);

        String brand=Optional.ofNullable(car)
                .map(Car::getBrand)
                .orElse("Unknown Brand");

        System.out.println("Brand : "+brand);

        String model = Optional.of(car)
                .map(Car::getModel)
                .orElseGet(()-> "Unknown Model");

        System.out.println("Model : "+model);


        Optional color=Optional.empty();
                color.ifPresent(System.out::println);

        System.out.println(color);  //boş değerde hata basmadı

        Integer year=Optional.ofNullable(car)
                .map(Car::getYear)
                .orElseGet(()->2023);

        System.out.println("Year of Car : "+year);
    }
}

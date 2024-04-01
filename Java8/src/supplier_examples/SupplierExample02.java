package supplier_examples;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample02 {
    public static void main(String[] args) {
        //Supplier<Integer> supplier=()->new Random().nextInt(20); //Random değer almaz ama değer döndürür .
        Supplier<Integer> supplier = new Random()::nextInt;
        Stream.generate(supplier)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("-----------------");

        //Supplier<Integer>supplier1=new Random()::nextInt;
        Supplier<Integer> supplier1 = () -> new Random().nextInt(20);
        Stream.generate(supplier1).limit(5)
                .filter(number -> number > 5) //filter içi ni biz yazıyoruz. number ı biz verdik
                .forEach(System.out::println);

        System.out.println("-------kendi metodum ile :-------");
        //kendi oluşturduğum metot ile
        //Supplier<Integer>supplier2=SupplierTest02::createRandomNumber;
        Supplier<Integer> supplier2 = () -> createRandomNumber();
        Stream.generate(supplier2).limit(5).filter(number->number>5).forEach(System.out::println);
    }

    public static Integer createRandomNumber() {
        return new Random().nextInt(20);
    }
}

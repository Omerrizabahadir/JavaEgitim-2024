package supplier_examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Supplierexample04 {
    public static void main(String[] args) {
        Stream.of("Java 8","Supplier","Example")
                .forEach(name->{
                    printNames(()->name);
                });

        List<String> stringList=Stream.generate(Supplierexample04::createNewsString)
                .limit(10).toList();
        System.out.println(stringList.size());

    }
    private  static String createNewsString(){
        return new String();
    }
    private static void printNames(Supplier<String> supplier){
        System.out.println(supplier.get());
    }
}

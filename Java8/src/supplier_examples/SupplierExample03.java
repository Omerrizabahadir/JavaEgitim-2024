package supplier_examples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierExample03 {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public static void main(String[] args) {
        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        //Supplier<String>currentDateTime=LocalDateTime.now()::toString;
        System.out.println("Current Date and time : " + currentDateTime.get());

        System.out.println("***********************");
        Supplier<LocalDateTime> supplier = LocalDateTime::now;
        System.out.println("Local Time Date : " + supplier.get());

        System.out.println("***********************");
        Supplier<String> supplier1 = () ->dtf.format(LocalDateTime.now());
        System.out.println(supplier1.get());
    }
}

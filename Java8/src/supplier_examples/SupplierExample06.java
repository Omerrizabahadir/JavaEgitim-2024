package supplier_examples;

import java.util.Optional;

public class SupplierExample06 {
    public static void main(String[] args) {
        String name = findNameById(1L).orElseGet(() -> "static name"); //değer null ise burası çalışır.null değilse burayı hiç çalıştırmaz
        System.out.println(name);
    }
    /*
    Eğer bir değer null gelme olasılığı varsa
    null gelebilecek kod Optional ile sarmalanır.Bu nedenle  String name = "null";
    kısmını Optional içine aldık
    return de aşağıdaki gibi olmalı
     */

    private static Optional<String> findNameById(Long id) {
        String name = "null";
        if (id == 1) {
            name = "java 8";

        }
        return Optional.ofNullable(name);
    }
}

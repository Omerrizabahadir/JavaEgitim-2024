package optional_examples;

import java.util.Optional;

public class OptionalExample06 {
    public static void main(String[] args) {
        Optional<Double> string=Optional.empty();

        System.out.println(string.orElse(string.orElse(Double.NaN)));// Supplier alıyor. değer almıyor değer döndürür
        System.out.println(string.orElseGet(Math::random)); //işlem yapıp değer döner. Function
        System.out.println(string.orElseThrow(IllegalAccessError::new));//hata fırlatır
    }
}

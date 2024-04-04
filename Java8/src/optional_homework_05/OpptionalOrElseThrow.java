package optional_homework_05;

import java.util.Optional;

public class OpptionalOrElseThrow {
    public static void main(String[] args) {
        String name=null;
        //orElseThrow(()->new IllegalArgumentException   ile hata fırlatsın istedim
        String result= Optional.ofNullable(name)
                .orElseThrow(()->new IllegalArgumentException("Name value is not to be null"));
        System.out.println(result);
    }
}

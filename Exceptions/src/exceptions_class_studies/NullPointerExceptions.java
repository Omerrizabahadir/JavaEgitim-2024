package exceptions_class_studies;

import java.util.Objects;

public class NullPointerExceptions {
    public static void main(String[] args) {
        String name = null;
        //if (!(name == null)) {          ////anacak bunun metodu olanı var onu kullanmak daha güzel

        if(Objects.nonNull(name)){

            System.out.println("işlem uznluğu" + name.length());

        }
        System.out.println("işlem yapılmıyor");


    }
}

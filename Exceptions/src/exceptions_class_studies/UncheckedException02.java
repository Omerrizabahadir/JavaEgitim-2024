package exceptions_class_studies;

import java.util.Objects;

public class UncheckedException02 {

    //UncheckedException -->Sadece RunTimeException'rdır.
    public static void main(String[] args) {

        String name=null;
        String name2="java";


        if (Objects.nonNull(name)&& name.equals("kadir")){
            name.toUpperCase();
            System.out.println("diğer kodlar");

        }

        System.out.println("uygulama kapatılıyor");


        //veya şu da olabilir. bu daha güzel yaklaşım
        if("kadir".equals(name)){       //name.equals("kadir")hata verir çünkü name null
            System.out.println("hoşgeldin");
        }
        System.out.println("UYGULAMA KAPATILIYOR");
    }
}

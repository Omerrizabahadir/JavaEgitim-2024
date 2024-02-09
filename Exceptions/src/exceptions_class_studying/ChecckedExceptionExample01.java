package exceptions_class_studying;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ChecckedExceptionExample01 {
    public static void main(String[] args)  {


        Random random=new Random();


        //try catch kullanarak handle ediyoruz. böylece FileWriter altını çizmiyor.
        try{
            FileWriter fileWriter=new FileWriter("doc");
            System.out.println("başarılı");

        }catch(IOException ioException){
            System.out.println("dosyalama işleminde hata ile karşılaşılsın"+ioException.getMessage());
        }


    }
}

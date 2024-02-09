package exceptions_class_studying;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionExample02 {
    public static void main(String[] args) throws IOException {
        //Add method signature ile throws IOException yaparak declare ederekte hata engellenir.
        //ama bunda try catch teki gibi işlem yapamam. sadece devam eder.
        FileWriter fileWriter=new FileWriter("a");
        System.out.println("declare ile çalıştı");
    }
}

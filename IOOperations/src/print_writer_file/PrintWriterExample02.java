package print_writer_file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample02 {

    public static void main(String[] args) {
        String userName="bilgeadam";
        try (PrintWriter printWriter=new PrintWriter("test.txt")){
            printWriter.println("merhaba Dünya");
            printWriter.printf("Hoşgeldiniz %s",userName);
            printWriter.println();
            printWriter.printf("sayı %d, metin %s",42,"merhaba");
        } catch (FileNotFoundException f) {
            System.out.println("dosya işlem hatası"+f.getMessage());
        }


    }
}

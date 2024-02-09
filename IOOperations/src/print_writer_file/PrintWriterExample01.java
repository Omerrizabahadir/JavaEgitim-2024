package print_writer_file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample01 {

    //bunun reader ı yok.Çok kullanılmaz bu da FileWriter gibi
    public static void main(String[] args) {
        PrintWriter printWriter=null;
        String fileNme="print_writer.txt";
        try {
            printWriter=new PrintWriter(fileNme);
            printWriter.println("hello");
            printWriter.println("world!");
            printWriter.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            printWriter.close();
        }
    }
}

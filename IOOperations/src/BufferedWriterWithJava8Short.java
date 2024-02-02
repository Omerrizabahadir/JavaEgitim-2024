import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterWithJava8Short {
    //java8 de kısa kullanım
    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("buffered_writer_file_short.txt"))){
            bufferedWriter.write("java8 kısa versiyonunu kullandık");

        } catch (IOException e) {
            System.out.println("hatalı"+e.getMessage());
        }
    }
}

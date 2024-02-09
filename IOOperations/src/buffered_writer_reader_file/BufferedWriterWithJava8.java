package buffered_writer_reader_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterWithJava8 {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("file_java8.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
bufferedWriter.write("merhaba !!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

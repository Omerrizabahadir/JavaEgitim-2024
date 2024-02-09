package file_writer_reader_file;

import java.io.FileWriter;
import java.io.IOException;

public class FileProcessWithJava {
    public static void main(String[] args) throws IOException {

        //java 8 öncesi kullanım

        FileWriter fileWriter = null;
        String fileName="file_writer.txt";
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write("merhaba ömer");
            fileWriter.write("\nhoşgeldin");
            fileWriter.write(System.lineSeparator());
            fileWriter.write("nextlines");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileWriter.close();
        }


        //java8 sonrası kullanım.FileWriter nesnesi artık try içinde olmalı
        //artık close kullanmayacaz
        try(FileWriter fileWriter1=new FileWriter("file_writer1.txt")){
            fileWriter1.write("java 8 ile yazıldı");
        }catch (IOException ioException){
            System.out.println("hata"+ioException.getMessage());
        }
    }
}

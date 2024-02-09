package file_writer_reader_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderExamples01 {
    //dosyayı her seferde tekrar yazma
    public static void main(String[] args) throws IOException {

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

//append true ile artık dosyaya her yazdırdığım öncekiler silinmeden eklenecek
        FileWriter fileWriter1=null;
        String fileName2="file_reader.txt";
       try {
           fileWriter1 = new FileWriter( fileName2,true);
           fileWriter1.write("hoşgeldin kullanıcı!!");
           fileWriter1.write("\n");
           fileWriter1.write("hehehh");
       }catch (IOException ioexception){
           throw new RuntimeException();
       }finally {
           fileWriter1.close();
       }

       //şimdi dosyayı okumak için FileReader kullanıcaz 1. dosyayı okutalım

        FileReader fileReader=null;
       int i;
       try {
           fileReader=new FileReader(fileName);
           while ((i=fileReader.read())!=-1){
               System.out.print((char)i);
           }
       }catch (FileNotFoundException fileNotFoundException){
           throw  new RuntimeException(fileNotFoundException);
       }finally {
           fileReader.close();
       }

    }
}
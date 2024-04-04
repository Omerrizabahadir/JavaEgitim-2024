package Exception_handling_try_catch;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandlingExample02 {
    public static void main(String[] args) {
        FileWriter fileWriter=null;

        String fileName="file_writer.txt";


        try {
            fileWriter=new FileWriter(fileName,false);
            fileWriter.write("merhaba file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //After java 7
        try {
            FileWriter fileWriter1=new FileWriter("file_writer2.txt");
        } catch (IOException e) {
            System.out.println("hata meydana geldi : "+e.getMessage());
        }
        //After java 7

        try {
            FileWriter fileWriter1=new FileWriter("buffered_writer.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter1);
            bufferedWriter.write("java ile yazıyorum");
        } catch (IOException e) {
            System.out.println("hata meydana geldi : "+e.getMessage());
        }

    }
}

package file_writer_reader_file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Homework01WithFileWriterBeforeJava8 {
    public static void main(String[] args) throws IOException {
        //Bir döngümüz olsun
        // Kullanıcıdan boş ifade girene kadar girdiği her yazıyı
        // dosyaya yazdır. Sonra bu yazıyı ekrana basrır.

        FileWriter fileWriter = null;
        String fileNme = "user_file.txt";
        int i;

        try {
            fileWriter = new FileWriter(fileNme);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("çıkış için yazmadan enter 'a basın");
                String userEntering = scanner.nextLine() ;
                if (userEntering.isEmpty())
                    break;
                fileWriter.write(userEntering);
                fileWriter.write("ömer");
            }
        } catch (IOException ioException) {
            System.out.println("hata" + ioException.getMessage());
        } finally {
            fileWriter.close();
        }
    }
}

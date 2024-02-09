package buffered_writer_reader_file;

import java.io.*;
import java.util.Scanner;

public class Homework01WithBufferedJva8 {
    public static void main(String[] args) {
        String fileName = "buffered_java8_file.txt";

        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("dosyaya eklemek istediklerinizi yoksa giriş yapmadan enter 'a basın");
                String entrance = scanner.nextLine();

                if (entrance.isEmpty())
                    break;
                bufferedWriter.write(entrance);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("buffered_java8_file.txt"))){
            String data;
            while((data=bufferedReader.readLine())!=null){

                System.out.println(data);
            }

    }catch (IOException e) {
            System.out.println("hata:"+e.getMessage());
        }
}
}

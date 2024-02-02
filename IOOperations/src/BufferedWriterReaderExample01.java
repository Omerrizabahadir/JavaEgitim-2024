import java.io.*;

public class BufferedWriterReaderExample01 {
    public static void main(String[] args) throws IOException {

        String fileName="buffered_writer.txt";
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("hello");
            bufferedWriter.write(" world");
            bufferedWriter.newLine();
            bufferedWriter.write("java!!");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileReader fileReader= null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader=new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String data =null;
        while ((data=bufferedReader.readLine())!=null){
            System.out.println(data);
        }
        bufferedReader.close();


    }
}

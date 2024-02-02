import java.io.File;
import java.io.IOException;

public class FileProcessExample02 {
    //dosya oluşturma
    public static void main(String[] args) {
        File file=new File("test.txt");
        System.out.println(file.isFile());
        System.out.println(file.exists());
       try {
           if(!file.createNewFile());
           file.createNewFile();
        }catch  (IOException e) {
           throw new RuntimeException(e);
       } {

        }
    }
}

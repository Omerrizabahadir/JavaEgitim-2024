import java.util.Scanner;

public class IfElseScanner02 {
    public static void main(String[] args) {
        String name="bilgeAdam";
        String password="12345";

        Scanner scanner=new Scanner(System.in);
        System.out.println("Adınızı giriniz!!  :");
        String kullaniciAdi=scanner.next();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Şifrenizi giriniz!!  :");
        String sifre=scanner1.next();

        if (name.equals(kullaniciAdi) && password.equals(sifre)){
            System.out.println("Hoşgeldin Bilge Adam");
        }else {
            System.out.println("Kullanıcı Adı veya Şifre hatalı");
        }
    }
}

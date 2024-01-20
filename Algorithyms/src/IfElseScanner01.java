import java.util.Scanner;

public class IfElseScanner01 {
    public static void main(String[] args) {

        String name = "bilge";
        int password = 12345;

        /* Burada password int tanımlandığı için integer dışında String bir şifre girildiğinde
        kullanıcı tarafından hata fırlatıyor
          int password yerine String olarak tanımladığında sorun çıkarmıyor*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsim giriniz:");
        String kullanıcıAdi = scanner.next();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Şifrenizi giriniz:");
        int kullaniciSifresi = scanner1.nextInt();
        if (name.equals(kullanıcıAdi) && password == kullaniciSifresi) {
            System.out.println("Hoşgeldiniz!!");
        } else {
            System.out.println("Kullanıcı Adınız veya Şifreniz hatalı!!!Tekrar deneyiniz");
        }

    }

}


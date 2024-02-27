package medium_com_sorulari;

import java.util.Scanner;

public class Soru01Methods {
    /*
     String tipinde sabit bir şifre değişkeni oluşturun.
      Örneğin: String password = “12345”; gibi. Ardından,
      kullanıcıdan klavyeden bir şifre girmesini isteyin.
      Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın.
      Eğer, iki değer birbirine eşitse ekrana “Giriş Başarılı!”,
      değilse “Giriş Başarısız” yazdırın.
     */
    public static void main(String[] args) {
        Soru01Methods soru01Tekrar = new Soru01Methods();
        String validPassword = soru01Tekrar.validPasswordRecord();
        String enterringPassword = soru01Tekrar.getEnteringPassword();
        soru01Tekrar.controllValidAndEntereringPassword(validPassword, enterringPassword);

    }

    public String validPasswordRecord() {
        String validPassword = "12345";

        return validPassword;
    }

    public String getEnteringPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen şifre giriniz!");
        String enteringPassword = scanner.next();
        return enteringPassword;
    }

    public void controllValidAndEntereringPassword(String validPassword, String enteringPassword) {

        while (true) {
            if (enteringPassword.equals(validPassword)) {
                System.out.println("Giriş başarılı");
              break;
            } else {
                System.out.println("Başarısız! ");


            }

        }

    }
}


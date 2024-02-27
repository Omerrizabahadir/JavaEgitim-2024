package medium_com_sorulari;

import java.util.Scanner;

public class Soru01 {
    /*
     String tipinde sabit bir şifre değişkeni oluşturun.
     Örneğin: String password = “12345”; gibi. Ardından,
     kullanıcıdan klavyeden bir şifre girmesini isteyin.
     Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın.
     Eğer, iki değer birbirine eşitse ekrana “Giriş Başarılı!”, değilse “Giriş Başarısız” yazdırın.
     */
    public static void main(String[] args) {
        Soru01 soru01=new Soru01();
        String password=soru01.getPassword();
        soru01.controllPassword(password);
    }
    public String getPassword(){
        String password="12345";

        return password;
    }
    public String controllPassword(String password){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen şifre giriniz!");
        String enteringPassword=scanner.next();
        while (true){
            if (enteringPassword.equals(password)){
                System.out.println("Giriş başarılı");
            }else {
                System.out.println("Başarısız! Lütfen tekrar giriniz!");
            }
            break;
        }
        return enteringPassword;
    }
}

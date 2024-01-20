package while_example;

import java.util.Scanner;

public class WhileLoop06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi = "bilge";
        String password = "123";
        int gHak = 3;
        boolean devamEt = true;

        while (devamEt) {
            System.out.println("Kullanıcı Adınızı girin:");
            kullaniciAdi = scanner.next();
            System.out.println("Şifre:");
            password = scanner.next();


            if (kullaniciAdi.equals("bilge") && password.equals("123")) {
                System.out.println("hoşgeldiniz");
               break;

            }else {
                devamEt=true;
                gHak--;
                System.out.println("Kalan hakkınız:"+gHak);
            }if (gHak==0){
                System.out.println("kart bloke olmuştur");
                break;
            }

            }


        }
    }


package Homework2024January07;

public class Homework03 {
    public static void main(String[] args) {
        //Do-while döngüsü kullanarak, 5'e bölünebilen sayıları
        // 1'den 50'ye kadar olan aralıkta ekrana yazdıran bir Java programı

        int i = 1;

        System.out.println("1-50 arası 5'e bölünebilen sayılar :");
        do {
            if (i%5==0) {
                System.out.print("\t "+i);
            }
                i++;
        }while (i<50);      //while içine aralık koşulu koy i zaten 1 'den başlıyor tekrar yazma i<50 de

        }
    }

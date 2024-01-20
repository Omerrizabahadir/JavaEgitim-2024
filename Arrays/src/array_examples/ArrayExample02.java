package array_examples;

public class ArrayExample02 {
    public static void main(String[] args) {

        /*
        Aşağıdaki sayı dizileri aynı şeyi ifade ediyor
         */

        int[] numbers1 = {1,2,5,6,8};   // burada sadece aynı zamanda diziye değeri aynı satırda verdik



        //üstteki dizinin tek tek ayrı ayrı değer atıyor. Üstteki numbers1 dizisinin açık hali
        int[] numbers2 = new int[5];   //burada değer atanmamış henüz
        //değer atayalım yukardakine

        numbers2[0] = 1;    // [0] 0'ıncı indeksi gösterir
        numbers2[1] = 2;
        numbers2[2] = 5;
        numbers2[3] = 6;
        numbers2[4] = 8;


        //yukardaki diziler aynıydı BOYUTLARI(eleman sayıları) 5 tir.


        numbers2[4]=9; //numbers ikinin 4. elemanını ezdim. artık 4. eleman 6 değil 9 oldu




        System.out.println("numbers1 'in 3. elemanı :"+numbers1[3]);

        System.out.println("numbers2 'nin 3. elemanı :"+numbers2[3]);


        System.out.println("-------------------------------------");
        //numbers1 dizisindeki sayıları ekrana yazdırmak istiyotsak for each ile
        System.out.println("For each ile yazılışı  : ");
        for (int i :numbers1) {
            System.out.println(i);
        }

            System.out.println("--------------------------------------");
           // veya for ile
            for (int k=0;k<numbers1.length;k++){
                System.out.println("Loop i2'nin : "+k+" değeri "+numbers1[k]);
            }
        }

    }


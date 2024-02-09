package geeks_for_geeks_method_examples_solutions;

public class MukemmelSayilar {

    /*Kendisi hariç bütün pozitif bölenlerinin toplamı,
     kendisine eşit olan sayılara mükemmel sayılar denir.
     Örneğin; 6 sayısının bölenleri: 1 + 2 + 3 = 6
     28 sayısının bölenleri: 1 + 2 + 4 + 7 + 14 = 28
     Şimdi 1 ile 1000 arasındaki mükemmel sayıları bulacağız. Java kodlarımız:
*/
    public static void main(String[] args) {
        MukemmelSayilar mukemmelSayilar = new MukemmelSayilar();
        mukemmelSayilar.mukemmelSayiBul();
    }

    public void mukemmelSayiBul() {

      int sum=0;
      for (int i=1;i<=1000;i++){
          for (int j=1;j<i;j++){
              if (i%j==0){
                 sum+=j;
              }
          }
          if (sum==i){
              System.out.println(i+" : sayısı mükemmel bir sayıdır");
          }
          sum=0;
      }
    }

}

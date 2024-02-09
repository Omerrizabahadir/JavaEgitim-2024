package geeks_for_geeks_method_examples_solutions;

public class MukemmelSayilar01 {
    public static void main(String[] args) {
MukemmelSayilar01 mukemmelSayilar01=new MukemmelSayilar01();
mukemmelSayilar01.mukemmelSayiBul();

    }
    public void mukemmelSayiBul(){
        int number=28;
        int sum=0;

        for (int i=1;i<number;i++){
            if (number%i==0){
                sum+=i;
            }
        }
        if (sum==number) {
            System.out.println("mükemmel sayıdır");
        }else  {
            System.out.println("mükemmel sayı değil");
        }

    }
}

package static_methods;

public class StaticMethodExample01 {
    public static void main(String[] args) {

        /*
        static= eğer iki metod da static ise herhangi bir şey
        yapmadan bir metoddan diğerine erişiriz
        Ancak metodlardan biri static diğeri ise static değilse
        static olmayana "new" anahtarı ile erişebiliriz

         */
        topla1(3, 6); //topla metoduna 2 şekilde erişim olur.b 1. si

        StaticMethodExample01.topla1(5, 8);  // 2. si ise metod hangi sınıfta ise o sınıf ile metadu çağırarak



        StaticMethodExample01 staticMethodExamples01=new StaticMethodExample01();
        staticMethodExamples01.topla2(1,6);

    }

    public static void topla1(int num1, int num2) {
        int toplam=num1+num2;
        System.out.println("toplam 1 "+toplam);
    }

    public void topla2(int sayi1,int sayi2){
        int toplam2=sayi1+sayi2;
        System.out.println("toplam 2 "+toplam2);
    }
}

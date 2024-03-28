package diamond_problem_01;

public class DiamondProblem implements MyInterface1,MyInterface2{
    @Override
    public void defaultMethod() {
        System.out.println("DiamondProblem defaultMethod");
       /*iki interfacede de aynı isimde default metot vardır.
       Biz bu 2 interface'i (MyInterface1,MyInterface2) implements ettiğimizde
       compiler hatası verir.
       MUTLAKA, default metoduda override etmelisin.Çünkü 2 taneden
       hangisini çalıştıracak java anlamaz.
        */
    }

    @Override
    public void test() {

    }
}

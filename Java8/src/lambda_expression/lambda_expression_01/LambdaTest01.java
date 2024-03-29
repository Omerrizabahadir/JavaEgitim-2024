package lambda_expression.lambda_expression_01;

public class LambdaTest01 {

    public static void main(String[] args) {


    /*
    Functional ınterface te abstract metotta parametre yoktu.
    Burada da lambda nın önü boş parantez odu yani parametre yok dedik
    YANİ;Eger Functional Interface icerisindeki abstract method parametre almiyorsa,
    () ifadesini kullanmaliyiz.
     */

        LambdaFunction lambdaFunction = () -> System.out.println("Hello world!");
        LambdaFunction lambdaFunction1=()-> System.out.println("hello class!");
        lambdaFunction.message();
        lambdaFunction1.message();
    }
}
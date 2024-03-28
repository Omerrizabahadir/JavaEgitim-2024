package lambda_expression_06;

public class LambdaTest06 {
    public static void main(String[] args) {

        String value1="hello";
        String value2="java";
        final String value3="world";



        LambdaFinal lambdaFinal=message -> System.out.println(message+", "+value1+" "+value2+" "+value3);
       /*
       lambda içerisindeki değer bir daha değiştirilemez.final anahtarı olsada olmasada
        */
        //value2="java8";
        //value1="hi";
        // burada value1 'e value2 ' ye tekrar deger set etmek istersek,
        // compile error verir, value2 legal degildir.
        // effectively final degildir.
        lambdaFinal.printMessage("abc");
    }
}

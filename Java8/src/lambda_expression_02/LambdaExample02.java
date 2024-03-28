package lambda_expression_02;

public class LambdaExample02 {
    public static void main(String[] args) {

        /*
        3 kullanımda doğru
         */
        LambdaFunctionWithParameter lambdaFunctionWithParameter1=(msg) -> System.out.println("Your message is : "+msg);
        LambdaFunctionWithParameter lambdaFunctionWithParameter2=msg -> System.out.println("your message is : "+msg);
        LambdaFunctionWithParameter lambdaFunctionWithParameter3=(String msg) -> System.out.println("your message is : "+msg);

        lambdaFunctionWithParameter1.message("hi, dou have time?");
        lambdaFunctionWithParameter2.message("hi, dou have time?");

    }
}

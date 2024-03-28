package lambda_expression_05;

public class LambdaTest05 {
    public static void main(String[] args) {

        LambdaFunctionV2 lambdaFunctionV2_01 = number -> {
            if (number % 2 == 0) return "even";
            else return "odd";
        };


        LambdaFunctionV2 lambdaFunctionV2_02 = number -> {
            if (number % number == 0) {
                return "even";
            } else {
                return "odd";
            }
        };
        System.out.println("number 5 is : " + lambdaFunctionV2_01.intKind(5));
        System.out.println("number 5 is :"+lambdaFunctionV2_02.intKind(5));
    }
}

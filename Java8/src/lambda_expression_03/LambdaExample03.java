package lambda_expression_03;

public class LambdaExample03 {
    public static void main(String[] args) {
        LambdaFunctionWithMoreParameters lambdaFunctionWithMoreParameters = (number1, number2) -> System.out.println("sum : " + (number1 + number2));
        lambdaFunctionWithMoreParameters.plus(12, 45);


        LambdaFunctionWithMoreParameters lambda02 = (int number1, int number2) -> System.out.println("plus is : " + (number1 + number2));
        lambda02.plus(34, 32);


        LambdaFunctionWithMoreParameters lambda03 = ( int number1, int number2) -> {
            System.out.println("Calculation");
            System.out.println("sum is : "+(number1+number2));
        };

        lambda03.plus(12,21);
    }
}

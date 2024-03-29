package lambda_expression.lambda_expression_04;

public class LambdaExample04 {
    public static void main(String[] args) {

        LambdaCalculator lambdaCalculator1=(number1, number2) -> number1-number2;
        LambdaCalculator lambdaCalculator2=(int number1, int number2) ->number1+number2;

        LambdaCalculator lambdaCalculator3=(number1, number2) -> {
            System.out.println("calculating : "+number1+"*"+number2);
            return number1*number2;
        };

        System.out.println(lambdaCalculator1.process(3,5));
        System.out.println(lambdaCalculator2.process(3,5));
        System.out.println(lambdaCalculator3.process(3,5));
    }
}

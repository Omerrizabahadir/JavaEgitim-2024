package function_example.function_example_08;

import java.util.function.Function;

public class FunctionExample08 {
    public static void main(String[] args) {
        Function<String,String>extractNumbers=text->{
            StringBuilder numbers=new StringBuilder();
            for (char c:text.toCharArray()){ //char array'e çevirdi
                if (Character.isDigit(c)){  //sayılara bakıyor
                    numbers.append(c);  //sayı ise numbers'a ekliyor append ile

                }
            }
            return numbers.toString();
        };

        String sentence="I have 3 apples and 5 oranges";  //bakacağı cümle
        String extractedNumbers=extractNumbers.apply(sentence);  //String cümleden sayıları alacak
        System.out.println("extracted numbers : "+extractedNumbers);
    }
}

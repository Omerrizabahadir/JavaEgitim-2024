package function_example_04;


import java.util.function.Function;



public class FunctionExample04 {
    public static void main(String[] args) {

       // Function<String,Integer> f1=str -> Utility.calculateLengthOfTemp(str);
        Function<String,Integer> f1=Utility::calculateLengthOfTemp;
        System.out.println("bilgeadam tamsayı olarak uzunluğu :"+f1.apply("bilgeadam"));//direkt Integer değeri verir



        Function<String,Integer>f2=String::length;
        //Function<String ,Integer>f3=e->e.length();
        System.out.println(f2.apply("bilgeadam"));
    }
}

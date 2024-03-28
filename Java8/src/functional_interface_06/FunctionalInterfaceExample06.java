package functional_interface_06;

public class FunctionalInterfaceExample06 {
    public static void main(String[] args) {

        String inputText="Merhaba Dünya";


        /*
        Eğer lambda ifadesi dışındaki bir değişkeni lambda expression içerisinde kullanıyorsak
        o değeri başka bir satırda değiştirmememiz gerekmektedir.hata alırız
         */
        //StringTransformer test = input -> inputText = inputText.toUpperCase();



        StringTransformer toUpperCaseTransformer=input -> input.toUpperCase();
        String transformerText=toUpperCaseTransformer.transform(inputText);


        System.out.println("Transformed Text : "+transformerText);

    }
}

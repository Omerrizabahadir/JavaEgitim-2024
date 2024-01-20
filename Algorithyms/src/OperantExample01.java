public class OperantExample01 {

    public static void main(String[] args) {
        int number1 = 87;
        int number2 = 13;
        boolean condition = true;

        //Ön arttırma operant'ları
        System.out.println("(number1) değeri :" + number1 + "\t" + "(++number1)değeri :" + (++number1));
        System.out.println("(number1) değeri :" + number1 + "\t" + "(number1++)değeri :" + (number1++));
        System.out.println("number1 son değer:" + number1);
        number1 = 2;
        number2 = 5;
        System.out.println("(number1) değeri :" + number1 + "\t" + "(--number1)değeri :" + (--number1));
        System.out.println("(number1) değeri :" + number1 + "\t" + "(number1--)değeri :" + (number1--));
        System.out.println("number1 son değer:" + number1);


        System.out.println("number2 değeri:" + number2 + "\t" + "(++number2)değeri:" + (++number2));
        System.out.println("number2 değeri:" + number2 + "\t" + "(number2++)değeri:" + (number2++) + "\t" + "number2 son değer :" + number2);


        System.out.println("condition :" + condition);
        System.out.println("condition :" + !condition);


        System.out.println("Toplama");
        number1 = 10;
        number2 = 20;
        number1 += number2;//number1=number1+number2 demektir
        System.out.println("after number1 += number2 number1 :" + number1);
        System.out.println("number1 value:" + number1);
        System.out.println("number2 value:" + number2);

        System.out.println("Çıkarma");
        number1 -= number2;
        System.out.println("number1-=number2 :" + number1);
        System.out.println("number1 value :" + number1);
        System.out.println("number2 value :" + number2);

        System.out.println("Çarpma");
        number1*=number2;
        System.out.println("number1*=number2 :"+number1);
        System.out.println("number1 value :"+number1);
        System.out.println("number2 value :"+number2);

        System.out.println("Bölme");
        float floatNumber1=0.8f;
        float floatNumber2=0.4f;
        floatNumber1/=floatNumber2;
        System.out.println("Float number1/=Float number2 :"+floatNumber1);
        System.out.println("Float number1 value :"+floatNumber1);
        System.out.println("Float number2 value :"+floatNumber2);


    }


}

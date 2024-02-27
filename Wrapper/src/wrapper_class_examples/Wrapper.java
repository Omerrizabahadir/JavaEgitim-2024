package wrapper_class_examples;

@SuppressWarnings("removal")
public class Wrapper {

    Boolean b1= new Boolean(true);
    Boolean b2= new Boolean("kadir");
    Boolean b3= new Boolean("tRue");
    Boolean b4= new Boolean("tRUe");
    Boolean b5= new Boolean("False");


    Byte byte1 = new Byte((byte) 5);
    Byte byte2 = new Byte("5");
    /*byte3 teki "kadir" NumberFormatException hatası verecektir.
    Bu nedenle byte için byte1 ve byte2 gibi olur sadece
     */
    //Byte byte3 = new Byte("kadir");

    Integer integer1=new Integer(10);
    Integer integer2=new Integer("15");
    Integer integer3= integer1+integer2;
    int int1=integer1+integer2;


    Float float1 =new Float(4.4);
    Float float2 =new Float("5.8");
    Float float3=new Float(6);
    Float float4=new Float("5.5");


    Character character=new Character('a');
    //Character Ascıı kodu da alabilir (char)65 gibi
    Character character1=new Character((char) 65);





}

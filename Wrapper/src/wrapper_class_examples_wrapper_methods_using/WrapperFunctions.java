package wrapper_class_examples_wrapper_methods_using;

@SuppressWarnings("removal")
public class WrapperFunctions {
    //-------------------valueOf() metodu---------------------------

    //volueOf metodu String'i wrapper'a çevirir
    Integer integer=Integer.valueOf("50"); //String -->Wrapper
    //String içine double türü koyarsan hata alırsın
    //Integer integer1=Integer.valueOf("50.3"); ;// RunTimeExceptin Error: java.lang.NumberFormatException: For input string: "50.3"

    Boolean boolean1=Boolean.valueOf("false");
    Boolean boolean2=Boolean.valueOf("true");
    Boolean boolean3=Boolean.valueOf("TruE");
    Boolean boolean4=Boolean.valueOf("kadir");


    Float float1=Float.valueOf("4.4");
    //Float float2=Float.valueOf(3.4); //olmaz hata verir


    //-------------------xxxValue()---------------------------

    Integer integerA=new Integer(150);
    int int1=integerA.shortValue();
    byte byte1= integerA.byteValue();

    //-------------------parsexxx()---------------------------
    int int2=Integer.parseInt("120");//-->Wrapper to primitive




}

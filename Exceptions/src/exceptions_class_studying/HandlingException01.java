package exceptions_class_studying;

public class HandlingException01 {
    public static void main(String[] args) {
        int number1=5;
        String name = null;
        try {

            System.out.println(number1/0);    //hatalı olduğunu düşündüğüm kod varsa try içine yazarım
            System.out.println("başarılı oldu");


        }catch (ArithmeticException arithmeticException){
            System.out.println("catch arithmeticException! \ndescription -->"+arithmeticException.getMessage());
        }

//normalde catch daha fazla yazılabilir.görmek için ayrı yazdım
        System.out.println("------------------------------");
        try {
            name.length();
            System.out.println("başarılı");
        }catch (NullPointerException nullPointerException) {
            System.out.println("catch nullPointerException-->"+nullPointerException);
        }
        System.out.println("Uygulama kapatılıyor" );

        System.out.println("------------------------------");
        //en genel exception hepsini yakalar. null pointer veya aritmetic exceptionları yakalar.
        try {


          //  name.length()
            System.out.println(number1/0);

        }catch (Exception exception){
            System.out.println("catch exception description");
        }




    }
}

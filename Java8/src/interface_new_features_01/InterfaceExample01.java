package interface_new_features_01;

public class InterfaceExample01 {
    public static void main(String[] args) {
        CoolInterface.staticMethod();
        //CoolInterface.staticMethod();    //staticMethod2(); private old. için çağıramadık hata verir

    /*!!!!!!!!!!!!!!!!!!
    private metot mainden çağıralamaz direkt.
    Ancak private metodu public metottan çağırırsan,Bu durumda mainden ulaşabilirsiv
     */
    }
}

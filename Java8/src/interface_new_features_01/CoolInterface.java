package interface_new_features_01;

public interface CoolInterface {
//Gövdesiz
    public abstract void make();   //gövdesiz abstract metot java8 öncesi vardı


    //static inteface te java8 ile birlikte geldi
    public static void staticMethod(){
        System.out.println("static method ");
        privateStaticMethod();

    }
    //ınterface'e private java9 ile geldi
    private static  void privateStaticMethod(){
        System.out.println("Private static method");
    }
}

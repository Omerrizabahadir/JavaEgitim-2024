package generic_example04;

public class GenericMethod02 {
    public static void main(String[] args) {
        DemoClass demoClass=new DemoClass();
        demoClass.genericMethod("Hello");
        //demoClass.<String>genericMethod("hello");     böylede kullanım oluyor ama bunu az görürsün


         demoClass.genericMethod(14);
         //demoClass.<Integer>genericMethod(14);
    }
}

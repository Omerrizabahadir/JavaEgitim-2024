package class_studies_polymorphism_method_overriding_17_feb_04;

public class Dog extends Animal{
    int size =4;

    @Override
    void feetSize() {
        System.out.println("Dog feetsiaze ");
    }
    void  gender(){
        System.out.println("male");
    }
}

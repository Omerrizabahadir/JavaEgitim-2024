package class_studies_abstruct_class_18_feb_01;

public class Main {
    public static void main(String[] args) {


        // Animal animal=new Animal();     hatalı sınıf abstruct ise new ile üretilmez


        //Ancak miras alan sınıf üretilebilir
        Dog dog = new Dog();
        dog.eat();
        dog.sound();
        Cat cat=new Cat();
        cat.eat();
        cat.sound();
    }
}

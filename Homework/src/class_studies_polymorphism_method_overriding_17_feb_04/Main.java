package class_studies_polymorphism_method_overriding_17_feb_04;

public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal();
        animal.feetSize();
        System.out.println(animal.size);
        System.out.println("---------------");

        Animal dogAnimal=new Dog();
        dogAnimal.feetSize();
        System.out.println(dogAnimal.size);
        System.out.println("------------------");

        Dog dog=new Dog();
        dog.feetSize();
        System.out.println(dog.size);
        System.out.println("-------------------");

        dog=new Terrier();
        dog.feetSize();
        System.out.println(dog.size);
    }
}
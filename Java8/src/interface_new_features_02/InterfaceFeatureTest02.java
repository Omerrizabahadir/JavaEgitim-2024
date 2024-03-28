package interface_new_features_02;

public class InterfaceFeatureTest02 {
    public static void main(String[] args) {


        Animal animal = new Dog();
        animal.eat();
        animal.run();
        animal.make();

        Animal.breath();

        //Dog dog=new Dog();   //bunu yapma.böyle olmalı  -->  Animal animal = new Dog();
        // Dog.run(); // legal degildir.
        // Dog.breathe(); // legal degildir.

        // interface'lerdeki static methodlari sadece,
        // interfaceAdi.staticMethodAdi seklinde cagirabiliriz.
        // bu method'lari degiskenler uzerinden cagiramiyoruz.
        // ama bunlari class yapisinda methodlara degiskenler uzerinden ulasabilecegimizi unutmayalim.

        SuperInterface.message();
        //SubClass.message(); //message metodu static olduğu için hata verir
        //Sub ile erişilemeez static metoda
        
    }

}
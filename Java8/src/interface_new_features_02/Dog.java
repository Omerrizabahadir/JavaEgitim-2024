package interface_new_features_02;

public class Dog implements Animal{

    @Override
    public void make() {
        System.out.println("Overriding method say : Dog is making");
    }
/*
Bunlar sana kalmış istersen implements edebilirsin.Zorunluluk yok
    @Override
    public void eat() {
        Animal.super.eat();
    }

    @Override
    public void run() {
        Animal.super.run();

 */
    }


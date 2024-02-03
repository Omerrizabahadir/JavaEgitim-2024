package Homework02;

public class Car extends Vehicle{
int numDoors;
    public Car(String brand, String model, int year,int numDoors) {
        super(brand, model, year);
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.numDoors=numDoors;
    }
    void start(){
        System.out.println("Car is starting");
    }
    void  stop(){
        System.out.println("Car is stopping");
    }
}

package Homework02;

public class Truck extends Vehicle{
    double cargoCapacity;
    public Truck(String brand, String model, int year,double cargoCapacity) {
        super(brand, model, year);
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.cargoCapacity=cargoCapacity;
    }
    @Override
    void  start(){
        System.out.println("Truck is starting");
    }
   @Override
   void stop(){
        System.out.println("Truck is stopping");
    }
}

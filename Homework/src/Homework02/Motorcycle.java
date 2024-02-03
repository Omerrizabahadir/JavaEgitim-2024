package Homework02;

public class Motorcycle extends Vehicle{
    boolean hasSidecar;
    public Motorcycle(String brand, String model, int year,boolean hasSidecar) {
        super(brand, model, year);
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.hasSidecar=hasSidecar;
    }
    void start(){
        System.out.println("Motorcycle is starting");
    }
    void stop(){
        System.out.println("Motorcycle is stopping");
    }
}

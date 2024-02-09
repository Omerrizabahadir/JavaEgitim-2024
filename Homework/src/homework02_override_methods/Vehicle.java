package homework02_override_methods;

public class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void start(){
        System.out.println("Vehicle is starting");
    }
    void stop(){
        System.out.println("Vehicle is stopping");
    }
}

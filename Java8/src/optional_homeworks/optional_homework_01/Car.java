package optional_homeworks.optional_homework_01;

public class Car {
    private  String brand;
    private  String model;
    private String color;
    private Integer year;


    public Car(String brand, String model, String color, Integer year) {
        this.brand = brand;
        this.model = model;
        this.color=color;
        this.year = year;

    }
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}

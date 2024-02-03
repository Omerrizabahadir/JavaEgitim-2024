package Homework02;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("BMW","5.20",2020,2);
        System.out.println("Marka : "+car.brand+ "\nKapı sayısı : "+car.numDoors
        +"\nÜretim yılı : "+car.year);
        car.stop();
        System.out.println("----------------------");

        Motorcycle motorcycle=new Motorcycle("Honda","GL-1800",2015,false);
        System.out.println("Marka : "+motorcycle.brand
               +"\nModel : " +motorcycle.model+"\nÜretim yılı : "+motorcycle.year
                +"\nYan römork : "+motorcycle.hasSidecar);
        motorcycle.stop();
        System.out.println("-----------------------");


        Truck truck=new Truck("Volvo","FH-16",2022,38000);
        truck.start();
        System.out.println("Marka : "+truck.brand+"\nModel : "+truck.model
        +"\nÜretim Yılı : "+truck.year+"\nKargo Kapasitesi : "+truck.cargoCapacity);
    }
}

package composition_geekforgeeks_example;

public class CompositionCarMain {
    public static void main(String[] args) {

        Car car=new Car();
        car=null;
        System.out.println(car);

        /*dışardan Engine'e erişemiyorsun.Sadece Car
        içerisinden erişir.Car null olunca Employee' de otomatik null oluyor
                */

    }
}

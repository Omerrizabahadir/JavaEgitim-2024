package composition_geekforgeeks_example;

public class Car {
    private  final Engine engine;

    public Car() {
        this.engine = new Engine();
    }
    public void move(){
        engine.work();
        System.out.println("Car is moving");
    }
}

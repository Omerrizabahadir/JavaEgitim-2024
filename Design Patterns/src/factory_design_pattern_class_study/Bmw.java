package factory_design_pattern_class_study;

public class Bmw implements Car {
    @Override
    public void name() {
        System.out.println("Car name is : Bmw");
    }

    @Override
    public void price(int price) {
        System.out.println("Car price is " + price);
    }
}

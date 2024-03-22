package factory_design_pattern_class_study;

public class Porsche implements Car {
    @Override
    public void name() {
        System.out.println("Car name is : Porsche");
    }

    @Override
    public void price(int price) {
        System.out.println("Porsche price is : " + price);
    }
}

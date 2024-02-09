package homework_01_constructor_method_getter_setter;

public class Triangle extends Shape {
    double base;
    double height;


    public Triangle(String color,double base, double height) {
        super(color);
        this.height = height;
        this.base=base;
    }



    @Override
    public void draw() {

        System.out.println("Drawing a triangle");
    }

    @Override
    public double calculateArea() {
        return    base*height/2;

    }
}

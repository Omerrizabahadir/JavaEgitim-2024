package homework_01_constructor_method_getter_setter;

public class Rectangle extends Shape {
    double width;
    double height;


    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height=height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");

    }

    @Override
    public double calculateArea() {
        return  width*height;
    }
}

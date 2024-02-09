package homework_01_constructor_method_getter_setter;

public class Circle extends Shape{

    double radius ;
    double pi;

    public Circle(String color,double radius) {
        super(color);
        this.radius=radius;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double calculateArea() {

        return Math.PI*radius*radius ;

    }
}

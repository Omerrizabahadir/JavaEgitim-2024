package homework_01;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("blue",7);
        circle.draw();
        System.out.println("Circle Area : "+circle.calculateArea());
        System.out.println("-------------------------");

        Rectangle rectangle=new Rectangle("black",9, 6);
        rectangle.draw();
        System.out.println("Rectangle Area:"+rectangle.calculateArea());
        System.out.println("--------------------------");
        Triangle triangle=new Triangle("yellow",5,9);
        triangle.draw();
        System.out.println("Triangle Area : "+triangle.calculateArea());
    }
}

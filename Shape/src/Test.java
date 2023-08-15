import shape.*;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3,4);
        System.out.println(rectangle);

        rectangle = new Rectangle(6,7, "black", true);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square = new Square();
        System.out.println(square);

        square = new Square(10);
        System.out.println(square);

        square = new Square(10, "blue", false);
        System.out.println(square);

        Triangle triangle = new Triangle();
        triangle = new Triangle(7, 8, 9 , "black", true);
        System.out.println(triangle);
    }
}

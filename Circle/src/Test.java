import circle.Circle;
import circle.Cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(5);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(10, 15);
        System.out.println(cylinder);

    }
}
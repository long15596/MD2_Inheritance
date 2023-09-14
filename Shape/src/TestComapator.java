import shape.Circle;
import shape.CircleComparator;

import java.util.Arrays;
import java.util.Comparator;

public class TestComapator {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(40);
        circles[1] = new Circle(90);
        circles[2] = new Circle(10, "baby blue", true);

        System.out.println("pre-sorted: ");
        for (Circle circle: circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted: ");
        for (Circle circle: circles) {
            System.out.println(circle);
        }
    }
}

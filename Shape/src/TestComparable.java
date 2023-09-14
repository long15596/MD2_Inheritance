import shape.ComparableCircle;

import java.util.Arrays;

public class TestComparable {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(5.8);
        circles[1] = new ComparableCircle(16.5);
        circles[2] = new ComparableCircle(9.6, "đen", false);

        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle: circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted");
        for (ComparableCircle circle: circles) {
            System.out.println(circle);
        }
    }
}

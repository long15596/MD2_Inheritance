import Point2D.Point2D;
import Point2D.Point3D;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D = new Point2D(1, 2);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        point3D = new Point3D(3,4,5);
        System.out.println(point3D);
    }
}
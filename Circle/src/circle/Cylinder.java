package circle;

public class Cylinder extends Circle{
    double height = 1.0;

    public Cylinder() {}

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFullArea () {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder{"
                + "height="
                + height
                + ", radius="
                + radius
                + ", full area= "
                + getFullArea()
                + ", volume= "
                + getVolume()
                + '}';
    }
}
package shape;

import resizeable.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * this.height;
    }

    public  double getPerimeter() {
        return 2 * (width * this.height);
    }

    @Override
    public String toString() {
        return "Rectangle with width = "
                + width +
                " and height = "
                + height
                + ", which is subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Before resize: "
                + getArea()
                + ", After resize: "
                + (getArea() + (getArea() * percent/100)));

    }
}

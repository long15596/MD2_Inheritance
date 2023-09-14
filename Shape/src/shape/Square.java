package shape;

import resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable {
    double side;
    public Square() {}

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        setHeight(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "Square with side = "
                + getSide()
                + ", which is a subclass of "
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

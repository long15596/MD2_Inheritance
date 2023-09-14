import resizeable.Resizeable;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class TestResize {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(70);
        shapes[1] = new Rectangle(70,80);
        shapes[2] = new Square(90);

        for (Shape item: shapes) {
            if(item instanceof Resizeable){
                ((Resizeable) item).resize(Math.random()*10);
            }
        }
    }
}

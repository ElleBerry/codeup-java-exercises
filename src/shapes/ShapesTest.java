package shapes;

public class ShapesTest {

    public static void main() {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println("box1 Area"+box1.getArea());
        System.out.println("box1 Perimeter"+box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.println("box1 Area"+box2.getArea());
        System.out.println("box1 Perimeter"+box2.getPerimeter());

    }
}

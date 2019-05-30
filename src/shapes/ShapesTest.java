package shapes;

public class ShapesTest {

    public static void main() {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println("box1 Area"+box1.getArea());
        System.out.println("box1 Perimeter"+box1.getPerimeter());

//        Rectangle box2 = new Square(5);
//        System.out.println("box1 Area"+box2.getArea());
//        System.out.println("box1 Perimeter"+box2.getPerimeter());

        Measurable myShape;

        myShape=new Square(8.8);
        System.out.println("Square:\n");
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape=new Rectangle(8.8,9.9);
        System.out.println("Rectangle:\n");
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
    }
}

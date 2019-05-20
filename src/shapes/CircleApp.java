package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Input input = new Input();

        System.out.println(input.yesNo());

        System.out.println("Area = "+circle.getArea());

        System.out.println("Circumference = "+circle.getCircumference());
    }
}

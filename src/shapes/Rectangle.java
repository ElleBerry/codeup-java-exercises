package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public void setLength(double length){
        super.length=length;
    }

    public void setWidth(double width){
        super.width=width;
    }

    public Rectangle(double length, double width){
        super(length, width);
    }

    @Override
    public double setLength() {
        return 0;
    }

    @Override
    public double setWidth() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}

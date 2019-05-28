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
}

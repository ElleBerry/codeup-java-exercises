package shapes;

public class Square extends Quadrilateral {

    public double setLength(){
        this.length=length;
        this.width=length;
        return length;
    }

    public double setWidth(){
        this.length=width;
        this.width=width;
        return width;
    }

    public Square(double side){
        super(side, side);
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

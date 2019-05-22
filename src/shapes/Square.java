package shapes;

public class Square extends Rectangle {
//    redefine variable to use side otherwise use length
    private double side;
        public Square(double side) {
            super(side, side);
        }
        @Override
        public double getArea(){
//            super. and this. are optional, used for clarification
            return Math.pow(super.length,2);
        }
        @Override
        public double getPerimeter(){
            return 4*this.side;
        }
}

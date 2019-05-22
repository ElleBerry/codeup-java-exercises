package shapes;
//import java.util.Scanner;

public class Rectangle {

//   static Scanner sc=new Scanner(System.in);

    protected static double length;
    protected static double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width){
//        System.out.println("Please Enter an Integer:");
//        this.length = sc.nextInt();
//        System.out.println("Please Enter an Integer:");
//        this.width=sc.nextInt();
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length*this.width;
    }

    public double getPerimeter() {
        return (2*this.length)+(2*this.width);
    }
}

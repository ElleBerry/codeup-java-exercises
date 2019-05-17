import java.util.Scanner;
public class Person {
    static Scanner sc = new Scanner(System.in);
    private static String name = "Elle";

    public static String getName(){
        System.out.println("Please enter a name:");
        name = sc.nextLine();
        return name;
    }

    public static void setName(String name){

    }

    public static void sayHello(){
        System.out.printf("Hello %s", name);
    }

    public static void main(String[] args) {

        getName();
        setName(name);
        sayHello();
    }
}

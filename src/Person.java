import java.util.Scanner;
public class Person {

    static Scanner sc = new Scanner(System.in);

    private static String name;

    public Person(String name){
       this.name = name;
    }

    public static String getName(){
        return name;
    }

    public static void setName(String name){
        System.out.println("Please enter a name:");
        name = sc.nextLine();
       Person.name=name;
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

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

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

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

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person person){
        Person[] morePeople = Arrays.copyOf(people, people.length+1);
//        morePeople[morePeople.length-1]=person;
        return morePeople;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        Person person = new Person("person4");
        String[] Persons = {"Person1", "Person2", "Person3"};
        for (String arrPerson : Persons){
            System.out.println(arrPerson);
//     SAME OUTPUT ^^ ENHANCED FOR LOOP^^
//        for (int i=0; i<Person.length; i+=1) {
//            System.out.println(Person[i]);

        public static String[] addPerson(String[] Array, int newLength) {

            String[] newPerson = new String[newLength];
            for (String newArray : newPerson){
                System.out.println(newArray);
            }
            return;
        }

//        }

        Person[] people = {new Person("Person1"), new Person("Person2"), new Person("Person3")};
        for (Person person : people){
            System.out.println(Person.getName());
        }
    }
}

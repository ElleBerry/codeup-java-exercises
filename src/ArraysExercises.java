import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person person){
        Person[] morePeople = Arrays.copyOf(people, people.length+1);
        morePeople[morePeople.length-1]=person;
        return morePeople;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] people = {new Person("Person1"), new Person("Person2"), new Person("Person3")};

            for (Person person : people){
            System.out.println(Person.getName());
        }
    }
}

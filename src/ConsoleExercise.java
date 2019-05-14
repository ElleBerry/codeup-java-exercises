import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %f%n", pi);

        System.out.println("Enter an integer:");
        int integer = sc.nextInt();
        System.out.format("The integer you entered was %d.%n", integer);

        System.out.println("Please Enter 3 Words: ");
        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();
        System.out.printf("Here are your words: %s,%s,%s%n", word1, word2, word3);

        System.out.println("Please Enter A Sentence: ");
        String sentence = sc.nextLine();
        System.out.printf("Your sentence was: %s%n", sentence);

        System.out.println("What is the length of the Codeup classroom?");
        int length = sc.nextInt();
        System.out.println("What is the width of the Codeup Classroom?");
        int width = sc.nextInt();
        System.out.printf("The length of the Codeup classroom is %s and the width is %s", length, width);
//        int area = 2(width * length);
        System.out.println("The area of the Codeup classroom is%");
    }
}
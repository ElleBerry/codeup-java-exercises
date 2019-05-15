import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "Sure";
        String yell = "Whoa, chill out";
        String empty = "Fine. Be that way";
        String none = "Whatever";

        System.out.println("Would you like to talk to bob?");
        String talk = sc.next();
        String userInput;
        System.out.println("Ask him a question.");

        do {
            userInput = sc.next();
            if (talk.equalsIgnoreCase("yes")) {
                if (userInput.endsWith("?")) {
                    System.out.println(answer);
                } else if (userInput.endsWith("!")) {
                    System.out.println(yell);
                } else if (userInput.isBlank()) {
                    System.out.println(empty);
                } else {
                    System.out.println(none);
                }
            }
        }while(!userInput.equalsIgnoreCase("go away"));
    }
}

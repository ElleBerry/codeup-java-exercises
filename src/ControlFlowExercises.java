import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        System.out.println("Please enter an integer:");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int userInput = sc.nextInt();
        System.out.println("Do you want to continue?");
        String answer = sc.next();
        System.out.println("Here is your table:");
        System.out.println("Number | squared | cubed");
        System.out.println("------ | ------- | ------");
        if(answer.equalsIgnoreCase("yes")){
            for(int i = 1; i<=userInput; i++){
                int squared = i*i;
                int cubed = i*i*i;
                System.out.printf("%-7d|%-9d|%-6d%n",i ,squared, cubed);
            }
        }
    }
}
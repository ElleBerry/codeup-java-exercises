import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        System.out.println("Please enter the students grade.");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        System.out.println("Do you want to continue?");
        String answer = sc.next();
        if(answer.equalsIgnoreCase("yes")){
            if(grade >= 88){
                System.out.println("You got an A!");
            }else if(grade >= 80 && grade <=87){
                System.out.println("You got a B!");
            }else if(grade>= 67 && grade <= 79){
                System.out.println("You got a C!");
            }else if(grade>=60 && grade <= 66){
                System.out.println("You got a D!");
            }else{
                System.out.println("You got an F!");
            }
        }
    }
}
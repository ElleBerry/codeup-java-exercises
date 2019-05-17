import java.util.Scanner;
public class HighLow {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int rnd =(int)(Math.random() *100) +1;
        game(rnd);
    }
    public static void game(int random){
        do{
            int guess = getInteger(1,100);
            if(guess>random){
                System.out.println("GO LOWER");
            }else if(guess<random){
                System.out.println("GO HIGHER");
            }else{
                System.out.println("YOU GUESSED IT!");
            }
        }while(true);
    }

    @SuppressWarnings("Duplicates")
    public static int getInteger(int min, int max){
        System.out.println("Please Enter a number");
        int userInput =Integer.parseInt(sc.nextLine());
        if(userInput>=min && userInput<=max){
            return userInput;
        }else{
            System.out.println("Number out of range.");
            return getInteger(min, max);
        }
    }
}

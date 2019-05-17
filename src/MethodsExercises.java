import java.util.Scanner;
public class MethodsExercises {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Exercise 1:");
//        addition(1, 4);
//        subtract(4,8);
//        multiply(3,9);
//        division(43,7);
//        modulus(2,3);
        System.out.println("～*～♡～*～♥～*～♡～*～♥～*～♡～*～♥～*～♡～*～");

        System.out.println("Exercise 2:");
        System.out.println("getInteger(1,10) = " + getInteger(1,10));

        System.out.println("～*～♡～*～♥～*～♡～*～♥～*～♡～*～♥～*～♡～*～");
        System.out.println("Exercise 3:");
        factorial();
        System.out.println("～*～♡～*～♥～*～♡～*～♥～*～♡～*～♥～*～♡～*～");
        System.out.println("Exercise 4:");
        dice();
    }

//    String ans = "yes";
//        while(ans.equalsIgnoreCase("yes")){
//        dice();
//
//    }
//    public static float addition(int n, int i){
//        System.out.println((n+i) + " add");
//        return n+i;
//    }
//
//    public static float subtract(int x, int y) {
//        System.out.println(x-y + " subtract");
//        return x-y;
//    }
//
//    public static float multiply(int t, int s){
//        System.out.println(t*s  + " multiply");
//        return t*s;
//    }
//
//    public static double division(double r, double c){
//        System.out.println(r/c + " divide");
//        return r/c;
//    }
//
//    public static float modulus(int m, int y){
//        System.out.println(m%y + " modulus");
//        return m%y;
//    }
//
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

    public static void factorial(){
       int num = getInteger(1,10);
       String out = "";
       int total = 1;
       for(int i = 1; i>=num; i--) {
           total *= num;
           out += i + "! = ...=" + (total) + "\n";
       }
        System.out.println(out);
    }

    public static void dice(){
        int sides = getInteger(1,100);
        int rnd = (int)(Math.random() * sides) + 1;
        int rnd2 = (int)(Math.random() * sides) + 1;
        System.out.println("rnd" + rnd);
        System.out.println("rnd" + rnd2);

        }

}


//    String cont = sc.nextLine();
//           System.out.println("Do you wish to continue");
//           if (cont.equalsIgnoreCase("yes")) {
//
//           }
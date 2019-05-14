public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 2;
        do{
            double square = (i * i);
            System.out.println(square);
            i++;
        }while(i<=10000);
    }
}

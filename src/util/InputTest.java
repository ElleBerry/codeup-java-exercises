package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

        System.err.println(input.getString());

        System.err.println(input.getInt(3,50));

        System.err.println(input.yesNo());

        System.err.println(input.getDouble(5,56));
    }

}

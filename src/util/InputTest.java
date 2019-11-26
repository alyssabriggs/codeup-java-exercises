package util;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();
        System.out.println(test.getString());
        System.out.println(test.yesNo());
        System.out.println(test.getInt(3,12));
        System.out.println(test.getInt());
        System.out.println(test.getDouble(10.5, 99.7));
        System.out.println(test.getDouble());
    }
}

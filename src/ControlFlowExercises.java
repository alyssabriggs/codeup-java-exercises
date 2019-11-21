import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        int i = 5;
        while (i <= 15){
            System.out.printf("i is %d.%n", i);
            i++;
        }

        int count = 100;
        do {
            System.out.printf("%d%n", count);
            count -= 5;
        } while (count > -10);
    }

}
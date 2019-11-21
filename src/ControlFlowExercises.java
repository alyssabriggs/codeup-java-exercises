import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        int i = 5;
        while (i <= 15){
            System.out.printf("i is %d.%n", i);
            i++;
        }

//        int count = 100;
//        do {
//            System.out.printf("%d%n", count);
//            count -= 5;
//        } while (count > -10);

        for (int count = 100; count > -10; count -= 5){
            System.out.printf("%d%n", count);
        }

//        int square = 2;
//        do {
//            System.out.printf("%d%n", square);
//            square *= 2;
//        } while (square < 1000000);

        for (int square = 2; square < 1000000; square *= 2){
            System.out.printf("%d%n", square);
        }

        for (int num = 1; num <= 100; num++){
            if (num % 3 == 0 && num % 5 == 0){
                System.out.printf("%d : FizzBuzz %n", num);
            } else if (num % 3 == 0){
                System.out.printf("%d : Fizz %n", num);
            } else if (num % 5 == 0){
                System.out.printf("%d : Buzz %n", num);
            } else {
                System.out.println("The number is neither fizz nor buzz");
            }
        }
    }

}
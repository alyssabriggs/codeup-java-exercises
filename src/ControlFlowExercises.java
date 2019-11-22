import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");


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
            if (num % 15 == 0){
                System.out.printf("%d : FizzBuzz %n", num);
            } else if (num % 3 == 0){
                System.out.printf("%d : Fizz %n", num);
            } else if (num % 5 == 0){
                System.out.printf("%d : Buzz %n", num);
            } else {
                System.out.println("The number is neither fizz nor buzz");
            }
        }

        // Table of powers.
        System.out.println("Give me a number:");
        int num = sc.nextInt();

        System.out.println("Here is your table:");
        System.out.println("Number     | Squared     | Cubed");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int h = 1; h <= num; h++) {
            System.out.printf("%d       | %d         | %d%n", h, h*h, h*h*h);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        // Convert given number grades into letter grades.
        /**
         * A : 100 - 88
         * B : 87 - 80
         * C : 79 - 67
         * D : 66 - 60
         * F : 59 - 0
         */

        System.out.println("Would you like to look at your letter grades?");
        String confirm = sc.next();

        while (confirm.equalsIgnoreCase("YES")) {
            System.out.println("What was your numeric grade?");
            int grade = sc.nextInt();

            char letterGrade;
            if (grade > 100)  {
                System.out.println("That's impossible. No one can give more than one hundred percent. By definition that is the most anyone can give.");
                continue;
            } else if (grade >= 90) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.printf("Congratulations you got a %c.%n", letterGrade);

            System.out.println("Would you like to look at your letter grades?");
            confirm = sc.next();
        }



    }
}

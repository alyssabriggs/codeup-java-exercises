import java.util.Random;
import java.util.Scanner;

public class MethodExercises {

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("addition(1,3) = " + addition(1,3));
        System.out.println(addition(1,3) == 4);
        System.out.println("subtraction(1,2) = " + subtraction(1,2));
        System.out.println(subtraction(1,2) == -1);
        System.out.println("multiplication(1,2) = " + multiplication(1,2));
        System.out.println(multiplication(1,2) == 2);
        System.out.println("division(1,2) = " + division(1,2));
        System.out.println(division(1,2) == 0.5);
        System.out.println("modulus(1,2) = " + modulus(1,2));
        System.out.println(modulus(1,2) == 1);

        System.out.println("userInput = " +  getInteger(1,25));

        System.out.println("calculateFactorial() = " + calculateFactorial());

//        factorial(7);
//        recursiveFactorial(7); System.out.println(multiplyWithLoop(7, 7));
//        System.out.println(multiplyWithRecursion(7, 7));
//
//
//
//        boolean continuing = true;
//
//        do {
////            System.out.print("Enter a number between 1 and 39: ");
//            int factorialInput = getInteger(1, 39);
//
//            long factorial = recursiveFactorial(factorialInput);
//            System.out.println(factorialInput + "! = " + factorial);
//
//            System.out.println("Would you like to continue? y/n");
//            if (scan.nextLine().equals("n")) {
//                continuing = false;
//            }
//        } while (continuing);
//
//        do {
//            System.out.println("How many sides on a pair of dice");
//            int sides = Integer.parseInt(scan.nextLine());
//            System.out.println("Would you like to roll the dice? y/n");
//
//            if (scan.nextLine().equals("y")) {
//                int side1 = (int) (Math.random() * sides) + 1;
//                int side2 = (int) (Math.random() * sides) + 1;
//                System.out.println("side1 = " + side1);
//                System.out.println("side2 = " + side2);
//            }
//            System.out.println("Would you like to roll again? y/n");
//            if (scan.nextLine().equals("n")) {
//                continuing = false;
//            }
//        } while (continuing);

        do {
            Random random = new Random();
            int winningNumber = random.nextInt(100) + 1;
            System.out.println("Give me a number to guess");
            guessGame(getInteger(1,40), winningNumber);
            System.out.println("Would you like to continue? (y/n)");
        }while (scan.nextLine().equalsIgnoreCase("y"));
    }


    public static double addition(double num1, double num2){
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }
    public static double modulus(double num1, double num2){
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {

        System.out.print(String.format("Enter a number between %d and %d: ", min, max));
        int input = Integer.parseInt(scan.nextLine());

//        RECURSION SOLUTION
        if (input < min){
            System.out.println("The number is lower than the min, try again:");
            return getInteger(min, max);
        } else if (input > max){
            System.out.println("The number is higher than the max, try again:");
            return getInteger(min, max);
        }

//        REGULAR SOLUTION
//        if (input > min && input < max) {
//            return input;
//        } else {
//            System.out.println("Invalid input");
//            return getInteger(min, max);
//        }
        return input;
    }

    public static long calculateFactorial(){
        int number = getInteger(1,10);
        // 4
        long output = 1;

        for (int counter = 1; counter < number; counter++){
            output *= counter;
        }

        return output;
    }

//    public static long factorial(int num) {
//
//        long output = 1;
//        for (int i = 1; i <= num; i++) {
//            output *= i;
//        }
//        return output;
//    }
//
//    public static long recursiveFactorial(int num) {
//        if (num == 1) {
//            return 1;
//        } else {
//            return num * recursiveFactorial(num - 1);
//        }
//    }

//    public static void rollDices(int sides){
//        // Create an instance of the Random class
//        Random random =  new Random();
//        int random1 = random.nextInt(sides) + 1;
//        int random2 = random.nextInt(sides) + 1;
//
//        System.out.println("random1 = " + random1);
//        System.out.println("random2 = " + random2);
//    }
//
//    public static int multiplyWithLoop(int num1, int num2) {
//        int output = 0;
//        for (int i = 0; i < num2; i++) {
//            output += num1;
//        }
//        return output;
//    }
//
//    public static int multiplyWithRecursion(int num1, int num2) {
//        if (num2 == 0) {
//            return 0;
//        } else {
//            return num1 + multiplyWithRecursion(num1, num2 - 1);
//        }
//    }

    public static void guessGame(int firstGuess, int winningNumber) {

        System.out.println("winningNumber = " + winningNumber);
        
        if (firstGuess == winningNumber){
            System.out.println("You won!");
        } else if (firstGuess < winningNumber){
            System.out.println("Go higher...");
            guessGame(getInteger(1,100), winningNumber);
        } else {
            System.out.println("Go lower");
            guessGame(getInteger(1, 100), winningNumber);
        }
    }
}

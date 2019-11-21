import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;


        System.out.format("The value of pi is approximately %.2f.%n", pi);


        System.out.println("Please enter an integer");
        int userInput = scanner.nextInt();

        System.out.println("You entered " + userInput + ".\n");

        System.out.println("Please enter three words");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();



        System.out.printf("You entered %s %s %s%n", word1, word2, word3);

        scanner.nextLine();

        System.out.println("Please enter a sentence.");
        String sentence = scanner.nextLine();

        System.out.printf("You entered: %s%n", sentence);


        System.out.println("Please enter the length and width of a Codeup classroom.");
        String width = scanner.nextLine();
        float w = Float.parseFloat(width);
        String length = scanner.nextLine();
        float l = Float.parseFloat(length);

        System.out.printf("The perimeter of the classroom is: %.2f units.%n", 2 * w + 2 * l);
        System.out.printf("The area of the classroom is: %.2f units squared.", w * l);
    }

}

import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){
        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer");
        int userInput = scanner.nextInt();

        System.out.println("You entered " + userInput + ".\n");

        System.out.println("Please enter three words");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        scanner.nextLine();


        System.out.println("You entered " + word1 + " " + word2 + " " + word3 + ".\n");


        System.out.println("Please enter a sentence.");
        String sentence = scanner.nextLine();

        System.out.println(sentence);


        System.out.println("Please enter the length and width of a Codeup classroom.");
        String width = scanner.nextLine();
        int w = Integer.parseInt(width);
        String length = scanner.nextLine();
        int l = Integer.parseInt(length);

        System.out.println("The perimeter of the classroom is " + ((2 * w) + (2 * l)));
        System.out.println("The area of the classroom is " + (l * w));
    }

}

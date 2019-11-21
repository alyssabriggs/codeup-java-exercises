import java.util.Scanner;

public class consoleIO {


    public static void main(String[] args) {
        System.out.println("Hello");
        String name = "Alyssa";
        int favNum = 5;
//        System.out.printf("Hello, " + name + "\n");
//        System.out.format("Hello %s, how are you today? ", name);
//        System.out.printf("Hello %s, your total is %d. %n", name, favNum);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite number?");
        String num = scanner.nextLine();

        System.out.println(num);

//        scanner.nextLine();

        System.out.println("Hey there friend. What is on your mind?");
        String input = scanner.nextLine();

        System.out.println(input);
    }
}
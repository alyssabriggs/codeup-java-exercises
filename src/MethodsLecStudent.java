import java.sql.SQLOutput;

public class MethodsLecStudent {

//  METHODS

/*
    TO DO TOGETHER: Write a public static method called orderFood that
    prints the message "I would like fries please."
 */
//public static void orderFood(){
//    System.out.println("I would like fries please.");
//}




/*
    TO DO: Write a public static method called favoriteSong that prints
    your favorite song.
 */

public static void favoriteSong(){
    System.out.println("Face");
}


/*
    TO DO: Write a public static method called weeksIn that prints
    message saying how many weeks you've been at Codeup.
 */

public static void weeksIn(){
    System.out.println("10 weeks");
}

//  METHOD OVERLOADING

/*
    TO DO TOGETHER: Overload your orderFood method. Create a version that
    takes in one String parameter which can replace the item they are
    ordering.
 */



public static void orderFood(){
    System.out.println("I would like fries please");
}

public static void orderFood(String food){
    System.out.printf("I would like %s please! \n", food);
}

public static void orderFood(String item, int number){
    System.out.printf("I would like %d %s\n", number, item);
}

public static void orderFood(String item1, String item2){
    System.out.printf("I would like %s and %s\n", item1, item2);
}
/*
    TO DO: Overload orderFood again. Create a version that takes in two
    parameters: a String replacing the item being ordered, and an int that
    represents how many of the item they would like to order. Display a new
    message using these arguments.
 */




/*
    TO DO TOGETHER: We'll overload orderFood again. We'll still have two
    parameters in this new version, however they will both be Strings
    representing two different items the customer wants. Let's display a
    new message reflecting the change.
 */

/*
    TO DO: Create a main method in this class. Use it to call your
    orderFood method. Run the program to see the results.
 */

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }

    public static void main(String[] args) {
        count(5);
//          prints 5, calls count(4)
//          prints 4, calls count(3)
//          prints 3, calls count(2)
//          prints 2, calls count(1)
//          prints 1, calls count(0) -> "All done!"
        getPower(5, 4);
//          5^4, Math.pow(5,4)

//          5 * getPower(5,3)
//          getPower(5,3) -> 5 * getPower(5,2)
//          getPower(5,2) -> 5 * 5
//          5 * 5 * 5 * 5



        orderFood();
        orderFood("burger");
        orderFood("pizzas", 5);
        orderFood("pozole", "tacos");
        favoriteSong();
        weeksIn();
    }

//  RECURSION



//    public static void main(String[] args) {
//        count(5);
//    }

/*
    BONUS: Take a look at the Fibonacci sequence. Write a
    recursive method that accepts an int argument representing the number
    or results printed out following the Fibonacci sequence.

    For example:

    fibonacci(5) would print -> 0 1 1 2 3
    fibonacci(10) would print -> 0 1 1 2 3 5 8 13 21 34
 */

// HINT: The recursive method should return an int for each number in the series

// HINT: you may need an additional method using a for loop to actually print
// each number. This is the one you'll call in your main()

}
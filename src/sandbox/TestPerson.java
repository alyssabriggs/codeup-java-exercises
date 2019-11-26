package sandbox;

public class Person {
    public String firstName;
    public String lastName;

    public static boolean liveOnEarth = true;

    public String sayHello() {
        return String.format("Hello from %s %s!", this.firstName, this.lastName);
    }

    public static String breathe(String oxygen){
        return "CO2";
    }


}

class Arithmetic {
    // static property
    public static double pi = 3.14159;

    // static methods
    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }
}
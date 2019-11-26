package sandbox;

public class OopTest {
    public static void main(String[] args) {
        Person rick = new Person();
        TestAddress ricksAddr = new TestAddress(
               "navarro",
                "600",
                "SAT"
        );

        System.out.println("rick.sayHello() = " + rick.sayHello());
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
        System.out.println(Person.breathe("air"));
        System.out.println(rick.breathe("air"));

//        Person.liveOnEarth;

        // prints "Hello from Rick Sanchez!"
        Person ada = new Person();
        ada.firstName = "Ada";
        ada.lastName = "Lovelace";

        Person grace = new Person();
        grace.firstName = "Grace";
        grace.lastName = "Hopper";

        System.out.println(ada.sayHello());   // "Hello from Ada Lovelace!"
        System.out.println(grace.sayHello()); // "Hello from Grace Hopper!"
    }

}

class MathTest {
    public static void main(String[] args) {
        System.out.println(Arithmetic.pi);

        Arithmetic.add(5, 5);      // 10
        Arithmetic.multiply(5, 5); // 25
    }
}
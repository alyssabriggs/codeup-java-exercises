public class PersonImplementation {


    public static void main(String[] args) {
        Person jane = new Person("Jane");
        System.out.println(jane.getName());
        jane.setName("Jenny");
        System.out.println(jane.getName());
        System.out.println(jane.sayHello());

    }
}

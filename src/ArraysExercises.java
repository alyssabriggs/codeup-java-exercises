import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = {
        new Person("Pam"),
        new Person("Jim"),
        new Person("Dwight")
        };

        people = addPerson(people, new Person("Michael"));


        for(Person person : people){
            System.out.println(person.sayHello());
        }


    }
    public static Person[] addPerson(Person[] people, Person p){
        Person[] output = Arrays.copyOf(people, people.length + 1);

        output[output.length - 1] = p;

        return output;
    }
}

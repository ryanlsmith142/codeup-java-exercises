import java.util.Arrays;


public class ArraysExercises {

        static Person[] people = new Person[3];

    public static void main(String[] args) {

        //ARRAY BASICS

        int[] numbers = {1, 2, 3, 4, 5};

        String numbersArrayString = Arrays.toString(numbers);

        System.out.println(numbersArrayString);


        people[0] = new Person("Paul");

        people[1] = new Person("Ben");

        people[2] = new Person("Brandon");

        for(Person person : people) {

            System.out.println(person.getName());

        } //for

        people = Person.addPerson(people, "Ryan");

        for(Person person : people) {

            System.out.println(person.getName());

        } //for


    } // main()

}

import java.util.Arrays;

public class Person {

    private String name;

    public Person(String name) {
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {

        System.out.println("Hello " + this.getName());
    }

    public static Person[] addPerson(Person[] peopleArray, String newName) {

        Person[] copyOfPersonsArray = Arrays.copyOf(peopleArray, peopleArray.length);

        copyOfPersonsArray[copyOfPersonsArray.length - 1] = new Person(newName);

        return copyOfPersonsArray;
    }


    public static void main(String[] args) {
        //EXERCISE ONE

//        Person ryan = new Person();

//        ryan.name = "Ryan";

//        System.out.println(ryan.name);

//        ryan.setName("Ryan");

//        System.out.println(ryan.name);

//        ryan.sayHello();

            //EXERCISE TWO

//        Person person1 = new Person();
//
//        person1.name = "John";
//
//        Person person2 = new Person();
//
//        person2.name = "John";
//
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);


//        Person person1 = new Person();
//        person1.name = "John";
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person();
//
//        person1.name = "John";
//
//        Person person2 = person1;
//
//        System.out.println(person1.getName());
//
//        System.out.println(person2.getName());
//
//        person2.setName("Jane");
//
//        System.out.println(person1.getName());
//
//        System.out.println(person2.getName());


    }
}

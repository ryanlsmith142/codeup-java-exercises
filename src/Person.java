public class Person {
    public String name;

    public String getName() {
        return name;
    }

    public void person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
//        Person ryan = new Person();

//        ryan.name = "Ryan";

//        System.out.println(ryan.name);

//        ryan.setName("Ryan");

//        System.out.println(ryan.name);

//        ryan.sayHello();

        Person person1 = new Person("John");

        Person person2 = new Person("John");

        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
    }
}

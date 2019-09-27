package animal;

public class Dog extends Animal {
    private String breed;
    private String name;

    public Dog(int age, String species, boolean isAlive, String breed, String name) {
        super(age, species, isAlive);
        setBreed(breed);
        setName(name);
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

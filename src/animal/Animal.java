package animal;

public class Animal {
    private int age;
    private String species;
    private boolean isAlive;

    public Animal(int age, String species, boolean isAlive) {
        setAge(age);
        setSpecies(species);
        setIsAlive(isAlive);

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }
}

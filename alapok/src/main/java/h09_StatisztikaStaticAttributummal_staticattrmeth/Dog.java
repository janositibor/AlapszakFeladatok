package h09_StatisztikaStaticAttributummal_staticattrmeth;

public class Dog {
    private String name;
    private int age;
    private Species species;
    private long codeNumber;

    public Dog(String name, int age, Species species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void setCodeNumber(long codeNumber) {
        this.codeNumber = codeNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Species getSpecies() {
        return species;
    }

    public long getCodeNumber() {
        return codeNumber;
    }
}

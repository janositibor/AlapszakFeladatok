package day03;

import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private int height;
    private double weight;

    public Person(int id, String name, LocalDate dateOfBirth, int height, double weight) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, LocalDate dateOfBirth, int height, double weight) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", height=" + height +
                ", weight=" + weight +
                '}'+"\n";
    }
}

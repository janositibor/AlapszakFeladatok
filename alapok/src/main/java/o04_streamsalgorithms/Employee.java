package o04_streamsalgorithms;

import java.time.LocalDateTime;

public class Employee implements Comparable<Employee>{
    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getYearOfBirth()-o.getYearOfBirth();
    }

    public boolean isBirthBeforeThatYear(int year) {
        return yearOfBirth<year;
    }

    public int getAge() {
        return LocalDateTime.now().getYear()-yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}

package f02_NevOsszefuzes_employee;

public class Employee {
    private String name;
    private String occupation;
    private int Salary;

    public Employee(String name, String occupation, int salary) {
        this.name = name;
        this.occupation = occupation;
        Salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + occupation + " - " + Salary + " Ft";
    }
}

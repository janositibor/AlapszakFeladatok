package d04_Registration_intromethods.employee;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the name of employee:");
        String name=scanner.nextLine();
        System.out.println("Type in the hiring year of the employee:");
        int hiringYear=scanner.nextInt();
        System.out.println("Type in the the employee's salary:");
        int salary=scanner.nextInt();
        scanner.nextLine(); // Dummy for the new line characters
        Employee employee=new Employee(name, hiringYear, salary);
        System.out.println(employee.toString());
        System.out.println("Type in the new name of employee:");
        name=scanner.nextLine();
        employee.setName(name);
        System.out.println(employee.toString());
    }
}

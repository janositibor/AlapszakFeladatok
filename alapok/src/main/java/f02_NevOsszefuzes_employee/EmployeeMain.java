package f02_NevOsszefuzes_employee;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the name:");
        String name=scanner.nextLine();
        System.out.println("Type in the occupation:");
        String occupation=scanner.nextLine();
        System.out.println("Type in the salary:");
        int salary=scanner.nextInt();
        Employee employee=new Employee(name, occupation, salary);
        System.out.println(employee);

    }

}

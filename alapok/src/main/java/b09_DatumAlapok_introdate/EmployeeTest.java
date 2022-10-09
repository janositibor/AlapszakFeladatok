package b09_DatumAlapok_introdate;

import java.util.Scanner;

public class EmployeeTest {
    private static void reportEmployee(Employee employee){
        System.out.println("The name of the employee: "+employee.getName());
        System.out.println("The date of birth for the employee: "+employee.getDateOfBirth());
        System.out.println("The begin of employment for the employee: "+employee.getBeginEmployment());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the name of the employee:");
        String name=scanner.nextLine();

        System.out.println("Type in the year of birth for the employee\" "+name+"\":");
        int year=scanner.nextInt();
        System.out.println("Type in the month of birth for the employee\" "+name+"\":");
        int month=scanner.nextInt();
        System.out.println("Type in the day of birth for the employee\" "+name+"\":");
        int day=scanner.nextInt();
        scanner.nextLine(); // Dummy for the new line characters
        Employee employee=new Employee(year, month, day, name);
        reportEmployee(employee);

        System.out.println();
        System.out.println("Type in the new name of the employee:");
        name=scanner.nextLine();
        employee.setName(name);
        reportEmployee(employee);
    }
}

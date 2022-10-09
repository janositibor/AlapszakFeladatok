package o04_streamsalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class EmployeHandler {
    private List<Employee> employeeList=new ArrayList<>();

    public EmployeHandler(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public long countOfEmployees(){
        long output=employeeList.stream()
                .count();
        return output;
    }

    public boolean isAllEmployeesBirthBefore(int year){
        boolean output=employeeList.stream()
                .allMatch(employee -> employee.isBirthBeforeThatYear(year));
        return output;
    }

    public long countOfEmployeesBirthBefore(int year){
        long output=employeeList.stream()
                .filter(employee -> employee.isBirthBeforeThatYear(year))
                .count();
        return output;
    }
    public List<String> nameOfEmployeesBirthBefore(int year){
        List<String> output=employeeList.stream()
                .filter(employee -> employee.isBirthBeforeThatYear(year))
                .map(Employee::getName)
                .collect(Collectors.toList());
        return output;
    } public List<String> nameOfAllEmployees(){
        List<String> output=employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        return output;
    }
    public List<Employee> employeesBirthBefore(int year){
        List<Employee> output=employeeList.stream()
                .filter(employee -> employee.isBirthBeforeThatYear(year))
                .collect(Collectors.toList());
        return output;
    }
    public int sumAges(){
        int output=employeeList.stream()
                .map(Employee::getAge)
                .mapToInt(Integer::intValue)
                .sum();
        return output;
    }
    public int minYearOfBirths(){
        OptionalInt output=employeeList.stream()
                .map(Employee::getYearOfBirth)
                .mapToInt(Integer::intValue)
                .min();
        return output.orElse(0);
    }
    public String nameOfTheOldest(){
        String output=employeeList.stream()
                .sorted()
                .findFirst()
                .map(Employee::getName)
                .orElse("");
        return output;
    }
    public int sumYearOfBirths(){
        int output=employeeList.stream()
                .map(Employee::getYearOfBirth)
                .mapToInt(Integer::intValue)
                .sum();
        return output;
    }

    public static void main(String[] args) {
        Employee employee0=new Employee("Fehér Virág",2000);
        Employee employee1=new Employee("Nagy Gábor",1976);
        Employee employee2=new Employee("Kis Péter",2002);
        Employee employee3=new Employee("Cső Norbert",1980);
        List<Employee> employeeList= Arrays.asList(employee0, employee1, employee2, employee3);
        EmployeHandler employeHandler=new EmployeHandler(employeeList);

        System.out.println(employeHandler.sumYearOfBirths());
        System.out.println(employeHandler.sumAges());
        System.out.println(employeHandler.countOfEmployees());
        System.out.println(employeHandler.countOfEmployeesBirthBefore(1990));
        System.out.println(employeHandler.minYearOfBirths());
        System.out.println(employeHandler.nameOfTheOldest());
        System.out.println(employeHandler.isAllEmployeesBirthBefore(1980));
        System.out.println(employeHandler.employeesBirthBefore(1990));
        System.out.println(employeHandler.nameOfAllEmployees());
        System.out.println(employeHandler.nameOfEmployeesBirthBefore(2001));

    }

}

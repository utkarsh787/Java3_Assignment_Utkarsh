//Q2)Given the following class Employee class{ Double Age; Double Salary; String Name}
// Design the class in such a way that the default sorting should work on firstname and lastname. Also, Write a program to sort Employee objects based on salary using Comparator.
import java.util.*;

class EmployeeClass implements Comparable<EmployeeClass> {
    private Double age;
    private Double salary;
    private String name;

    public EmployeeClass(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int compareTo(EmployeeClass other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return "Employee{Name='" + name + "', Age=" + age + ", Salary=" + salary + "}";
    }
}

public class Question2 {
    public static void main(String[] args){
        List<EmployeeClass> employees = Arrays.asList(
                new EmployeeClass(22.0, 45000.0, "utkarsh Gupta"),
                new EmployeeClass(39.0, 34500.0, "Alok Yadav"),
                new EmployeeClass(23.0, 90000.0, "Pallavi Rajput"),
                new EmployeeClass(18.0, 50000.0, "Aman Kumar"),
                new EmployeeClass(32.0, 15000.0, "Sumit Sharma")
        );

        Collections.sort(employees);
        System.out.println("This is Default sorting ");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> e1.getSalary().compareTo(e2.getSalary()));
        System.out.println();
        System.out.println("Sorted salary using Comparator");
        employees.forEach(System.out::println);
    }
}

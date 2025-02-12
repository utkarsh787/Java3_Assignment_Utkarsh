//Q) Q3)Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value and perform reverse sorting of salary with the help of Comparator.?
import java.util.*;

class Employee {
    String name;
    int age;
    String designation;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return age == employee.age && name.equals(employee.name) && designation.equals(employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
    @Override
    public String toString() {
        return name + " (" + designation + ")";
    }
}
public class Question3 {
    public static void main (String[] args){

        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee("Aman", 30, "Manager"), 70000);
        employeeMap.put(new Employee("Vishal", 25, "Developer"), 50000);
        employeeMap.put(new Employee("Rohit", 35, "HR"), 60000);
        employeeMap.put(new Employee("Utkarsh", 22, "CEO"), 100000);
        employeeMap.put(new Employee("Shyam", 28, "Analyst"), 55000);


        List<Map.Entry<Employee, Integer>> sortedEntries = new ArrayList<>(employeeMap.entrySet());


        sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));


        System.out.println("Employees sorted by salary (Descending Order):");
        sortedEntries.forEach(entry -> System.out.println(entry.getKey() + " -> $" + entry.getValue()));
    }
}

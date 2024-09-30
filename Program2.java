import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", department=" + department + "]";
    }
}

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.println("Enter the number of Employees: ");
        int numberOfEmployees  = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter the details for Employee " + (i + 1) + ": ");
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Age: ");
            int age = scanner.nextInt();
            System.out.println("Department: ");
            scanner.nextLine();
            String department = scanner.nextLine();
            employees.add(new Employee(name, age, department));
        }


        List<Employee> filteredEmployees = employees.stream().filter(emp -> emp.getName().startsWith("A")).collect(Collectors.toList());

        System.out.println("Employees whose name start with 'A':");
        if (filteredEmployees.isEmpty()) {
            System.out.println("No employees");
        }else {
            filteredEmployees.forEach(System.out::println);
        }
    }
}

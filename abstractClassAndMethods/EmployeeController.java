package abstractClassAndMethods;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Salaried Employee");
            System.out.println("2. Add Hourly Employee");
            System.out.println("3. View Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    addSalariedEmployee();
                    break;
                case 2:
                    addHourlyEmployee();
                    break;
                case 3:
                    viewEmployees();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addSalariedEmployee() {
        System.out.println("\nEnter details for Salaried Employee:");
        System.out.print("ID: ");
        String id = sc.next();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Team Name: ");
        String teamName = sc.next();
        System.out.print("Mobile Number: ");
        String mobile = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee employee = new SalariedEmployee(id, name, teamName, mobile, email, salary);
        employees.add(employee);
        System.out.println("Salaried Employee added successfully!");
    }

    private static void addHourlyEmployee() {
        System.out.println("\nEnter details for Hourly Employee:");
        System.out.print("ID: ");
        String id = sc.next();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Team Name: ");
        String teamName = sc.next();
        System.out.print("Mobile Number: ");
        String mobile = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Worked Hours: ");
        int workedHours = sc.nextInt();

        Employee employee = new HourlyEmployee(id, name, teamName, mobile, email, workedHours);
        employees.add(employee);
        System.out.println("Hourly Employee added successfully!");
    }

    private static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("\nNo employees found!");
            return;
        }

        System.out.println("\n===== Employee Details =====");
        for (Employee emp : employees) {
            emp.getEmployeeDetails();
            System.out.println("Calculated Pay: " + emp.calculatePay());
            System.out.println("---------------------------");
        }
    }
}

abstract class Employee {
    private String id;
    private String name;
    private String teamName;
    private String mobileNumber;
    private String email;
    protected double salary;

    public Employee(String id, String name, String teamName, String mobileNumber, String email, double salary) {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.salary = salary;
    }

    public void getEmployeeDetails() {
        System.out.println(
            "ID: " + id +
            " | Name: " + name +
            " | Team: " + teamName +
            " | Mobile: " + mobileNumber +
            " | Email: " + email +
            " | Salary: " + salary
        );
    }

    public abstract double calculatePay();
}

class HourlyEmployee extends Employee {
    private static final int SALARY_PER_HOUR = 400;
    private int workedHours;

    public HourlyEmployee(String id, String name, String teamName, String mobileNumber, String email, int workedHours) {
        super(id, name, teamName, mobileNumber, email, SALARY_PER_HOUR * workedHours);
        this.workedHours = workedHours;
    }

    @Override
    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Worked Hours: " + workedHours + " | Salary Per Hour: " + SALARY_PER_HOUR);
    }

    @Override
    public double calculatePay() {
        return workedHours * SALARY_PER_HOUR;
    }
}

class SalariedEmployee extends Employee {
    public SalariedEmployee(String id, String name, String teamName, String mobileNumber, String email, double salary) {
        super(id, name, teamName, mobileNumber, email, salary);
    }

    @Override
    public double calculatePay() {
        return salary; 
    }
}

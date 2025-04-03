package constructors;

import java.util.ArrayList;
import java.util.List;

public class EmployeeConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101, "Alice Johnson", "Engineering", "Software Engineer", 75000, "123456789", "alice.johnson@zoho.com", "9876543210");
        Employee emp2 = new Employee(102, "Bob Smith", "HR", "HR Manager", 65000, "987654321", "bob.smith@zoho.com", "9123456789");
        Employee.addEmployee(emp1);
        Employee.addEmployee(emp2);
        
        Employee.printAllEmployees();
	}

}

class Employee {
	private static final String COMPANY =" Zoho";
	
	private int employeeId;
	private String name;
	private String department;
	private String role;
	private double salary;
	// Employee's PII
	private String securityNumber;
	private String email;
    private String phoneNumber;
    
    private static List<Employee> allEmployee = new ArrayList<>();
    
    public Employee(int employeeId, String name, String department, String role, double salary, String securityNumber, String email, String phoneNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.role = role;
        this.salary = salary;
        this.securityNumber = securityNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

	public static void addEmployee(Employee emp) {
		allEmployee.add(emp);
	}

	public static String getCompany() {
		return COMPANY;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

//	Controlled access to PII
	public String getSecurityNumber() {
		return "XXX-XX-" + securityNumber.substring(securityNumber.length() - 4);
	}

	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public static void printAllEmployees() {
        System.out.println("***** All Employee *****");
        int i=1;
        for (Employee employee : allEmployee) {
            System.out.println((i++)+"."+employee);
        }
    }
	
	@Override
    public String toString() {
        return "Employee \n" +
                "ID=" + employeeId +
                ", Name='" + name + '\'' +
                ", Department='" + department + '\'' +
                ", Role='" + role + '\'' +
                ", Salary=$" + salary +
                ", Company='" + COMPANY + '\'' +
                ", Email='" + email + '\'' +
                ", Phone='" + phoneNumber + '\'' +
                ", Security Number='" + getSecurityNumber() + '\'' +
                " }";
    }

}


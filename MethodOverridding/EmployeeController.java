package MethodOverridding;

public class EmployeeController {
	public static void main(String[] args) {
		Employee salariedEmployee = new SalariedEmployee("Z-S-0557", "Anumitha", "Web Master", "936123****", "anumitha@gmail.com", "anumitha@123", 100000);
		Employee hourlyEmployee = new HourlyEmployee("Z-S-0558", "Agnes", "Zoho Books", "987654****", "agnes@gmail.com", "agnes@123", 10);
		
		salariedEmployee.getEmployeeDetails();
		hourlyEmployee.getEmployeeDetails();
	}
}

class Employee {
	private String id;
	private String name;
	private String teamName;
	private String mobileNumber;
	private String email;
	private String password;
	private double salary;
	
	public Employee(String id, String name, String teamName, String mobileNumber, String email, String password, double salary) {
		this.id = id;
		this.name = name;
		this.teamName = teamName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.setPassword(password);
		this.salary = salary;
	}
	public void getEmployeeDetails(){
		System.out.println(
				"ID : " + this.id + 
				" Name : "+ this.name +
				" Mobile Number : "+ this.mobileNumber +
				" Team Name : " + this.teamName + 
				" Email : " + this.email + 
				" Salary : " + this.salary
				);
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

class HourlyEmployee extends Employee{
	
	private static final int SALARY_PER_HOUR = 400;
	
	public HourlyEmployee(String id, String name, String teamName, String mobileNumber, String email, String password,
			int workedHours) {
		super(id, name, teamName, mobileNumber, email, password, SALARY_PER_HOUR * workedHours);
	}

	@Override
	public void getEmployeeDetails()
	{
		super.getEmployeeDetails();
		System.out.println("Salary Per Hour : " + SALARY_PER_HOUR);
	}
}

class SalariedEmployee extends Employee {
	public SalariedEmployee(String id, String name, String teamName, String mobileNumber, String email, String password, double salary) {
		super(id, name, teamName, mobileNumber, email, password, salary);
	}
	
	@Override
	public void getEmployeeDetails()
	{
		super.getEmployeeDetails();
	}
}


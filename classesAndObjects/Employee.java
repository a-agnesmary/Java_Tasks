package classesAndObjects;

public class Employee {
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

}

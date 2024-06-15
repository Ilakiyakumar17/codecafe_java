package ProgramPackage33;

public class Employee {
	private int empId;
	private String name;
	private String designation;
	private float salary;

	// Default Constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public Employee(int empId, String name, String designation, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	// getter and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	// toString
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ "]\n";
	}

}

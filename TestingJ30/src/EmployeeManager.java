public class EmployeeManager {
    private String employeeName;
    private double salary;

    public EmployeeManager(String name, double salary) {
        this.employeeName = name;
        this.salary = salary;
    }
        
    public String getEmployeeName() {
		return employeeName;
	}

    public double getSalary() {
		return salary;
	}
}
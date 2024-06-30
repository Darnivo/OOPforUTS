
public class TaxCalculator {
	public void calculateTax(EmployeeManager employee) {
        double tax = employee.getSalary() * 0.2; // Assume 20% tax
        System.out.println("Tax for " + employee.getEmployeeName() + " is " + tax);
    }
}

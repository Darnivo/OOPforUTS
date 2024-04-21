
public class Employee  extends Person{
	private String office;
	private Integer salary;
	private MyDate dateHired;
	
	
	
	public Employee(String name, String address, String phoneNumber, String email, 
					String office, Integer salary, MyDate dateHired) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	public String test() {
		return (salary.toString());
	}
	
	public String testDate() {
//		return String.format("Year= %d, Month= %d,Day= %d", dateHired.getYear(), dateHired.getMonth(), dateHired.getDay());
		return String.format("YYYY-MM-DD = %04d-%02d-%02d", dateHired.getYear(), dateHired.getMonth(), dateHired.getDay());
	}
	
	@Override
	public String toString(){
		return "Employee "+ getName();
	}

	public String getOffice() {
		return office;
	}

	public Integer getSalary() {
		return salary;
	}

	public String getDateHired() {
		return testDate();
	}
	
	
}

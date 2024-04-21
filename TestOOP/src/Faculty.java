
public class Faculty extends Employee{
	private Integer officeHours;
	private String rank;

	
	public Faculty(String name, String address, String phoneNumber, String email, String office, Integer salary,
			MyDate dateHired, Integer officeHours, String rank) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	@Override
	public String toString(){
		return "Faculty "+ getName();
	}
	
}

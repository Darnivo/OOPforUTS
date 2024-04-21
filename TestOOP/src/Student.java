
public class Student extends Person{
	private final String classStatus;

    private boolean statValid(String str) {
        return str.equalsIgnoreCase("Freshman") || str.equalsIgnoreCase("Sophomore")
                || str.equalsIgnoreCase("Junior") || str.equalsIgnoreCase("Senior");
    }
	
	public Student(String name, String address, String phoneNumber, String email, String classStatus) {
		super(name, address, phoneNumber, email);
		
		if(statValid(classStatus)) {
			this.classStatus= classStatus.toUpperCase();
		}else { 
			throw new IllegalArgumentException("Invalid class status");
		}
//		this.classStatus= classStatus;
	}
	
	
	
	public String getClassStatus() {
		return classStatus;
	}

	@Override
	public String toString(){
		return "Student "+ getName();
	}
	
}

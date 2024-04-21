
public class main {

	public static void main(String[] args) {
//		System.out.println("amogus");
		
		Person person = new Person("A","B street","+620912","12@g.com");
		System.out.println(person.toString());
		
		
		try {
		Student student = new Student("C","D street","+620123","34@g.com","Freshman");
		System.out.println(student.toString());
		} catch (IllegalArgumentException e){
			System.out.println("Error: " + e.getMessage());
		}
		
		
		try {
		Student student2 = new Student("CC","DD street","+620123","3434@gg.com","Unemployed");
		System.out.println(student2.toString());
		} catch (IllegalArgumentException e){
			System.out.println("Error: " + e.getMessage());
		}
		
		Employee employee = new Employee("E", "F street", "+81231", "56@f.com", "Sunib", 240000, new MyDate(2004,5,31));
		System.out.println(employee.toString());
		
//		System.out.println(employee.testDate());
		
		Faculty faculty = new Faculty("G", "H Blvd", "+27125", "78@e.com", "Binoos", 100000, new MyDate(1986,4,26), 230, "Assistant");
		System.out.println(faculty.toString());
		
		Staff staff = new Staff("I", "J Blvd", "+25251", "90@d.com", "Suenib", 132000, new MyDate(1963,11,22), "Intern");
		System.out.println(staff.toString());
		
		System.out.printf("%s %s %s %s\n", staff.getName(),staff.getPhoneNumber(),staff.getAddress(),staff.getEmail());
		
		System.out.println(faculty.getDateHired());
		System.out.println(staff.getDateHired());
		
	}

}


import java.util.ArrayList;

public class main {

	public static void main(String[] args) { 
		String name = "Hello World";
		Integer x = 2341;
		
//		System.out.println("%s,%s".formatted(x,name));
		
		
		Printer<Integer> A = new Printer<>(21);
		A.print();
		Printer<String> B = new Printer<>("Hello World");
		B.print();
		Printer<Double> C = new Printer<>(3.14);
		C.print();
		
		ArrayList<Object> Objs = new ArrayList<Object>();
		Objs.add(A);
		Objs.add(B);
		Objs.add(C);
		
		for (Object obj : Objs) {
			((Printer<?>) obj).print();
		}
		
		EmployeeManager emp1 = new EmployeeManager("John Doe", 50000);
		EmpDatabaseManager db = new EmpDatabaseManager();
		TaxCalculator tax = new TaxCalculator();
		ReportGenerator report = new ReportGenerator();
		
		db.saveEmployee(emp1);
		tax.calculateTax(emp1);
		report.generateReport(emp1);
		
	}
	
	public static String yes(String a, Integer b) {
		return "%s,%s".formatted(b,a);
	}
	
	
	
	
	
	
			
	
	

}

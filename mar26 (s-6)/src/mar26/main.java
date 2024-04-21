package mar26;

public class main {

	public static void main(String[] args) {
		Circle C1 = new Circle();
		System.out.println(C1.getTotalObj());
		Circle C2 = new Circle();
		System.out.println(C2.getTotalObj());
		Circle C3 = new Circle();
		System.out.println(C3.getTotalObj());
		
		System.out.println(Circle.getTotalObj());
		// Circle.setradius(5);
		
		Rectangle R1 = new Rectangle();
		System.out.println(Circle.getTotalObj());
		
		System.out.println();
		Testoverloading test = new Testoverloading();
		System.out.println(test.calculate());
		System.out.println(test.calculate(143));
		System.out.println(test.calculate(12,5));
		
		System.out.println(test.calculate("20",5));
		System.out.println(test.calculate(20,"20"));
		
		Cat cat = new Cat("Pussy");
		Person person = new Person("Andi",cat);
		System.out.println(person.getName());
		System.out.println(person.getCatName());
		System.out.println(cat.getName());
		System.out.println(person.getTeeth());
	}

}

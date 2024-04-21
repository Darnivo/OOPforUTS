package mar26;

public class Person {

	private String name;
	private Cat cat;
	private FakeTeeth teeth;
	
	public Person(String name, Cat cat) {
		this.setName(name);
		this.cat = cat;
		teeth = new FakeTeeth(6);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getCatName() {
		return cat.getName();
	}

	public int getTeeth() {
		return teeth.getNumOfTeeth();
	}
	
}

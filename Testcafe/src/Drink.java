
public class Drink extends MenuItem{

	enum size {SMALL, MEDIUM, LARGE};
	
	size setsize;
	
	public Drink(String name, double price, size size) {
		super(name, price);
		this.setsize = size;
	}

	public size getSetsize() {
		return setsize;
	}
	
	
	
}

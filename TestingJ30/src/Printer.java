public class Printer <T>{

	T thing;

	public Printer(T thing) {
		this.thing = thing;
	}
	
	public void print() {
		if (thing instanceof String) {
			System.out.println("String: " + thing);
		}else if (thing instanceof Integer) {
            System.out.println("Integer: " +(int)Math.pow((int)thing, 2));
		}else {
		System.out.println(thing.getClass().getSimpleName() + ": " + thing);
		}
		
	}

	
}

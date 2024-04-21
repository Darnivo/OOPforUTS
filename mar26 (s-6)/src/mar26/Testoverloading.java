package mar26;

public class Testoverloading {
	public int calculate() {
		return 1;
	}
	
	public int calculate(int a) {
		return a*10;
	} 
	
	public int calculate(int a, int b) {
		return a*b;
	}
	
	public int calculate(String a, int b) {
		return b%2;
	}
	
	public int calculate(int b,String a) {
		return b%3;
	}
	
}

package mar26;

public class Circle {
	private double radius;

	private static int numberofObj = 0;
	public static int getTotalObj() {
		return numberofObj;
	}
	
	public static void addNumOfObj (){
		numberofObj ++;
	}
	
	
	public Circle() {
		numberofObj++;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}


public class Triangle extends shape {

	@Override
	public int getArea(int length, int height) {
		return (length * height)/2 ;
	}

	public Triangle(int length, int height) {
		super(length, height);
		// TODO Auto-generated constructor stub
	}

}

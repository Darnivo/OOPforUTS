
public class Rectangle extends shape {

	@Override
	public int getArea() {
		return getLength() * getHeight();
	}

	public Rectangle(int length, int height) {
		super(length, height);
		// TODO Auto-generated constructor stub
	}
	
}


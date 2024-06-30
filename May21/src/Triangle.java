
public class Triangle extends shape {

	@Override
	public int getArea() {
		return (getLength() * getHeight())/2 ;
	}

	public Triangle(int length, int height) {
		super(length, height);
		// TODO Auto-generated constructor stub
	}

}

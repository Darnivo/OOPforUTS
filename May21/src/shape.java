
abstract public class shape {
	
	int length;int height;
	abstract public int getArea(int length, int height);
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public shape(int length, int height) {
		this.length = length;
		this.height = height;
	}
	
	
	
}

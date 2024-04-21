
public class rectangle {
	private int  length, width;

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public rectangle(int length, int width) {
//		super(); 
		// ^ not needed
		this.length = length;
		this.width = width;
	}
	
	/* Constructor >  Alt+shift+s & o
	 * Use this to initialize it 
	 */
	
	public void draw() {
		for(int l=1;l<=length;l++) {
			for(int w=1;w<=width;w++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}
	
}

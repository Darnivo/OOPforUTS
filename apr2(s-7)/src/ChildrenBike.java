
public class ChildrenBike {
	Bycicle bike;
	ElectricPower ePower;
	
	private int numOfWheel;
	
	public ChildrenBike(int numOfWheel) {
		this.bike = new Bycicle(1, 2);
		this.numOfWheel = numOfWheel;
	}
	
}

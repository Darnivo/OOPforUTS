
public class MountainBike extends Bycicle{

	private int seatHeight;
	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);	//call parent constructor
		this.seatHeight = seatHeight;
	}
	
	@Override
	public void setGear(int gear) {
		this.gear = gear*2;
	}
	
	public int getSeatHeight() {
		return seatHeight;
	}
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public void speedup() {
		speed*=2;
	}
	
	public void reduceSpeed() {
		speed -=getBrake();
	}
	
	public void setParentSpeed(int pSpeed){
		super.setSpeed(pSpeed);
	}
	
	public int getParentSpeed(){
		return super.getSpeed();
	}
}

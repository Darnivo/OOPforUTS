
public class ElectricBike extends MountainBike{

	private int batteryHour;
	

	public ElectricBike(int gear, int speed, int seatHeight) {
		super(gear, speed, seatHeight);
	}

	public int getBatteryHour() {
		return batteryHour;
	}


	public void setBatteryHour(int batteryHour) {
		this.batteryHour = batteryHour;
	}
	
	
	
}

package vehicle;

public class car {
	private String brand;
	
	public String getBrand() {
		return brand;
	}

	public car() {
		brand = "Ferarri";
	}
	
	public String getBikeType() {
		bicycle bikeObj = new bicycle();
		return bikeObj.type;
	}
}


public class Animals {
	private String name;
	private int points;
	private String sound;
	
	public Animals(String name, int points, String sound) {
		this.name = name;
		this.points = points;
		this.sound = sound;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}

	public String getSound() {
		return "\"%s\"".formatted(sound);
	}
	
	
}

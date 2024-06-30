import java.util.Random;

public class Hunting {
	
	private static Animals[] AnimalsList = {
			new Duck(), new Boar(), new Elk()
	};
	
	
	private static int randomWithinRange(int start, int end) {
		Random random = new Random();
		return random.nextInt(end - start + 1) + start;
	}
	
	public static Animals getRandom() {
		return AnimalsList[randomWithinRange(0, AnimalsList.length - 1)];
	}
}

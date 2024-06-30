import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Enter number of hunters:");
//		int HuntersQTY = scanner.nextInt();
//		scanner.nextLine();
		
		ArrayList<Hunter> Hunters = new ArrayList<>();
		
//		for(int i=0;i<HuntersQTY;i++) {
//			System.out.printf("Hunter%d's name:",i+1);
//			String name = scanner.nextLine();
//			Hunters.add(new Hunter(name));
//		}
		
		Hunters.add(new Hunter("John Doe"));
		Hunters.add(new Hunter("Jane Doe"));
		Hunters.add(new Hunter("John Smith"));
		Hunters.add(new Hunter("Jane Smith"));
		
		System.out.println("Enter number of hunting rounds:");
		int HuntingQTY = scanner.nextInt();
		scanner.nextLine();
		
		for(int i=0;i<HuntingQTY;i++) {
			System.out.println("Round "+(i+1));
			for (Hunter hunter : Hunters) {
				Animals animal = Hunting.getRandom();
				System.out.println(animal.getSound()+","+hunter.getName() + " hunted a " + animal.getName());
				hunter.addpoints(animal.getPoints());
			}
			System.out.println("");
		}
		
		for (Hunter hunter : Hunters) {
			System.out.println(hunter.getName()+"'s score: ");
			for (int point : hunter.getRecord()) {
				System.out.println(point);
			}
			System.out.println("Total: "+hunter.getScore()+"\n");
		}
		
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		for(int x: arr) {
			System.out.println(x*x+1);
		}
	}

}

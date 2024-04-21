
public class Main {
	public static void main(String[] args) {
		Bycicle bike = new Bycicle(3, 5);
		MountainBike mountBike = new MountainBike(5,7,1);
		
		System.out.println(bike.getGear());
		System.out.println(mountBike.getSpeed());
		System.out.println(mountBike.getSeatHeight());
		mountBike.speedup();
		System.out.println(mountBike.getSpeed());
		
		mountBike.setBrake(2);
		mountBike.reduceSpeed();
		System.out.println("After reduction = "+mountBike.getSpeed());
		
		mountBike.setParentSpeed(20);
		System.out.println(mountBike.getParentSpeed());
		System.out.println(mountBike.getSpeed());
	}
}


/*
Mid exam:
1. 2 Case essay about inheritance, composition, aggregation (only theory) 
2. 1 Case (coding) > scoring based on output + OOP concept
		^ Concepts: - Class, object & its relationships
					- Constructor
					- Array list
					- Inheritance / Composition / Aggregation (Only one, type depends on the case)
					- Fulfilling case requirements
+ Time: 100 mins in lab
+ No need for input validation
*/
import vehicle.car;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("sos");
		
		circle circObj = new circle();
		
		circObj.setRadius(4);
		
		System.out.println(circObj.getArea());
		
		
		circObj.setRadius(6);
		System.out.println(circObj.getRadius());
		
		
		rectangle RectObj = new rectangle(3,10);
		
		RectObj.draw();

		System.out.println("");
		
		RectObj.setLength(2);
		RectObj.setWidth(6);
		RectObj.draw();
		System.out.println("");
		
		car CarObj = new car();
		
		/*
		 *  vehicle.car CarObj = new vehicle.car();
		 *  	^ if you dont want to import
		 */ 
		
		
		System.out.println(CarObj.getBrand());
		
		
//		vehicle.bicycle bikeObj = new vehicle.bicycle();
//		System.out.println(bikeObj.type);
		// ^ error because of diff package
		
		System.out.println(CarObj.getBikeType());
		
		
	}
}

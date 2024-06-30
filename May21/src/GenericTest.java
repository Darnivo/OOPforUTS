
public class GenericTest {
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray = {'a','b','c'};
		
		System.out.print("Int Array: ");
		printArray(intArray);
		
		System.out.print("Double Array: ");
		printArray(doubleArray);
		
		System.out.print("Char Array: ");
		printArray(charArray);
		
		
		System.out.println(getMax(4, 6, 1));
		
		Rectangle rect = new Rectangle(5,10);
		Triangle tri = new Triangle(10,10);
		
		System.out.println("equal or not =" +equalArea(rect,tri));
		System.out.println(getMax(2, 7, 5));
	}
	
	public static <E extends shape> boolean equalArea(E shape1,E shape2) {
		return shape1.getArea() == shape2.getArea();
	}
	
	public static <T> void printArray(T[] arr) {
		for (T x :arr) {
			System.out.print(x +" ");
		}
		System.out.println("");
	}
	
	// ^ this can replace all this v
	
//	public static void printArray(Integer[] arr) {
//		for(Integer x : arr) {
//			System.out.print(x +" ");
//		}
//		System.out.println("");
//	}
//	
//	public static void printArray(Double[] arr) {
//		for(Double x : arr) {
//			System.out.print(x +" ");
//		}
//		System.out.println("");
//	}
//	
//	public static void printArray(Character[] arr) {
//		for(Character x : arr) {
//			System.out.print(x +" ");
//		}
//		System.out.println("");
//	}
	
	public static <T extends Comparable<T> > T getMax(T a,T b,T c) {
		T max = a;
		if(b.compareTo(max)> 0) {
			max = b;
		}
		if(c.compareTo(max)> 0) {
			max = c;
		}
		return max;
//		return 0;
	}
	
}

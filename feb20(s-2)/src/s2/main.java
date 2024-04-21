package s2;

public class main {

	public static void main(String[] args) {
		Integer a = 5;
		Integer b = 10;
		System.out.println("max(a,b) = "+ Integer.max(a,b));
		
		System.out.println("trailing zeroes = "+ Integer.numberOfTrailingZeros(2));
		
		String c = "108";
		Integer result = a+b+ Integer.parseInt(c);
		System.out.printf("a+b+c = %d\n",result);
		System.out.printf("0x(a+b) = %s\t",Integer.toHexString(a+b));
		System.out.printf("0b(a+b) = %s\n",Integer.toBinaryString(a+b));
		
		Integer max = Integer.MAX_VALUE;
		System.out.println(max);
		System.out.println(Math.log10(max)/Math.log10(2));
		
		Integer d = new Integer(23);
		String e = "Hello";
		e = e.concat(c);
		System.out.println(e);
		System.out.println("char at 2 = " + e.charAt(2));
		
		if(e.contains(c)) {
			System.out.println("has c");
		}else {
			System.out.println("doesn't have c");
		}
		
		System.out.println(a.compareTo(b));
		
		// == -> dont use to compare string, use to compare object
		// .equals -> use to compare value
		// .compareto -> check amount of difference
	
		System.out.println(Math.log10(32)/Math.log10(2));
		
		try {
			int f = 5/0;
			System.out.println(f);
		}catch(ArithmeticException ex) {
			System.out.println("error");
		}
		
	}

}

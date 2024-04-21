package utsplayground;

import java.util.Random;
import java.lang.Math;

public class testclass {
	int a;
	int b;
	int c;
	int d;
	public testclass(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
		Random rand = new Random();
		this.c = rand.nextInt(a>b?a:b);
		this.d = (int)Math.pow(a, b);
	} 
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
	
	@Override public String toString() {
		return String.format("[%d %d %d %d]", a,b,c,d);
	}
	
}

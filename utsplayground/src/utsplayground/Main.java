package utsplayground;

import java.lang.Math;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static Random rand = new Random();
	
    public static void main(String[] args) { 
    	System.out.println("sus");
    	String txt1 = "Hello world";
    	System.out.println(txt1.substring(1, 5).toUpperCase());
    	System.out.println(txt1.isEmpty()?"yes":"no");
    	System.out.println(txt1.matches("\\d+")?"only numeric":"not only numeric");
    	System.out.println(txt1.matches("[a-zA-Z ]+")?"only alphabetic":"not only alphabetic");
    	
    	System.out.println("");
    	
    	String em1 = "Yesu5@gmail.com";
    	String em2 = "Jojo@binus.com.com";
    	System.out.println(em1.matches("[a-zA-Z0-9]+@[a-zA-Z]+.com$")?"valid":"not valid");
    	System.out.println(em2.matches("[a-zA-Z0-9]+@[a-zA-Z]+.com$")?"valid":"not valid");
    	
    	System.out.println("");
    	
    	String goofy1 = "22142-12321-112";
    	System.out.println(goofy1.matches("[0-9-]+")?"valid":"not valid");
    	System.out.println(goofy1.matches("[0-9\\-]+")?"valid":"not valid");
    	
    	System.out.println("");
    	
    	String phoneNum = "+62081994280766";
    	System.out.println(phoneNum.matches("\\+[0-9]{14}$")?"valid":"not valid");
    	String phoneNum2 = "+6208199428076";
    	System.out.println(phoneNum2.matches("\\+[0-9]{14}$")?"valid":"not valid");
    	String phoneNum3 = "62081994280766";
    	System.out.println(phoneNum2.matches("\\+[0-9]{14}$")?"valid":"not valid");

    	System.out.println("");
    	
    	String pattern = "colou?r"; // Matches "color" or "colour"
    	System.out.println("color".matches(pattern));   // true
    	System.out.println("colour".matches(pattern));  // true
    	System.out.println("colouur".matches(pattern)); // false

    	System.out.println("");
    	
    	testclass TestC = new testclass(16,2);
    	System.out.println(TestC.getC());
    	System.out.println(TestC.getD());
    	
    	float testf = (float)Math.PI;
    	
    	System.out.println("");
    	
    	System.out.println(testf);
    	System.out.println(Math.floor(testf));
    	System.out.println(Math.sqrt(testf));
    	System.out.println(Math.round(testf));
    	
    	
    	phoneNum = phoneNum.concat(" > Joe's ");
    	System.out.println(phoneNum);
    	String testformat = String.format("yes %f amogus %s", testf, goofy1);
    	System.out.println(testformat);
    	
    	System.out.println("Tostring: "+ TestC.toString()); 
    	
    	System.out.println("");
    	
    	
    	
    	ArrayList<testclass> testArrList = new ArrayList<>();
    	for(int i=0;i<10;i++) {
    		testclass newtest = new testclass(rand.nextInt(10)+1, rand.nextInt(4)+1);
    		testArrList.add(newtest);
    	}
    	
    	System.out.println(testArrList.size());
    	
    	testArrList.set(2, TestC);
    	
    	for(int i=0;i<testArrList.size();i++) {
    		System.out.println(i+". "+testArrList.get(i).toString());
    	}
    	
    	System.out.println("");
    	
    	int arrsize = 5;
    	int[] testArr = new int[arrsize];
    	
    	for(int i=0;i<arrsize;i++) {
    		testArr[i]= rand.nextInt(100);
    	}
    	System.out.println(Arrays.toString(testArr));
    	
    
    	Integer testInt = 4;
    	
    	testInt++;
    	System.out.println(testInt);
    	
    	Mage mageTest = new Mage(2, 2, 1);
    	System.out.printf("%d %d %d %d %d\n",mageTest.getHp(),mageTest.getAttack(),mageTest.getSpeed(),mageTest.getLevel(),mageTest.getA());
    }

}


package com.qa.calc;

public class Calculations {

	
	public static int subtractNumbers(int a, int b) {
		
		int result = a - b;
		return result;
	}
	
	public static int addNumbers(int a, int b) {
		
		int result = a + b;
		return result;
	}
	
	public static int multiplyNumbers(int a, int b) {
		
		int result = a * b;
		return result;
		
	}
	public static int divideNumbers(int a, int b) {
		
		int result = a / b;
		return result;
	}
	
	public static int raisePowersOf(int a, int b) {
		
		int result = 1;
		
		for(int i=0; i<b; i++) {
			
			result *= a;
			
		}
		
		
		return result;
		
	}
	
	
	public static int raisePowersOfEasy(int a, int b) {
		
		
		int result = (int) Math.pow(4, 3);
		
		return result; 
	}
	
	public static int modulusNumbers(int a, int b) {
		
		
		int result = a % b;
		
		return result; 
	}
	
}

package com.qa.demo;

public class returnTypes {
	public static String stringMethod() {
		return "This is a string";
	}
	
	
	public static int intMethod() {
		return 25;
	}
	
	public static boolean booleanMethod() {
		return true;
	}
	
	public static char charMethod() {
		return 'c';
	}
	
	public static float floatMethod() {
		return 25.7f;
	}
	
	
	public static Object nothingMethod() {
		return null;
	}
	
	public static int stringtoIntMethod() {
		String str = "7";
		return Integer.parseInt(str);
		
	}
}

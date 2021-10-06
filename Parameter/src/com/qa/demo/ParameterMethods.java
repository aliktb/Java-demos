package com.qa.demo;

public class ParameterMethods {

	public static void month(int number) {
		 System.out.println("The month number is " + number);
		
	}

	
	public static void day(String dayName) {
		
		System.out.println("Today is " + dayName);
		
	}
	
	public static void todaysTemperature(float temp) {
		
		System.out.println("The temperature right now is " + temp + " celsius");
		
	}
	
	public static void rain(boolean willItRain, float humidity) {
		
		
		System.out.println("It is currently " + humidity + "%. It will rain today: " + willItRain);
	}
	
	public static void river(float length, String name) {
		
		System.out.println("The longest river in the world is " + name + ". It is " + length + " km long!");	
	}
	
	public static void ocean(char hemisphere, boolean isWarm , int volume) {
		
		System.out.println("The largest ocean in the world is in the " + "hemisphere. "
				+ "It has " + volume + " m3 of water!. The ocean is warm today: " + isWarm);	
		
	}
	
	public static int adder(int num1, int num2) {
		
		int sum = num1 + num2;
		
		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
		
		return sum;
		
	}
	
	
	
	
}

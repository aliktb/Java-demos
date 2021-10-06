package com.qa.demo;

import com.qa.calc.Calculations;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println(Calculations.subtractNumbers(10, 2));
		System.out.println(Calculations.addNumbers(10, 2));
		System.out.println(Calculations.multiplyNumbers(10, 2));
		System.out.println(Calculations.divideNumbers(10, 2));
		System.out.println(Calculations.raisePowersOf(0, 0));
		System.out.println(Calculations.raisePowersOfEasy(4, 3));
	}
	
	
}

package com.qa.demo;

import com.qa.cond.Exercise;

public class Runner {
	public static void main(String[] args) {
		Exercise.task1(1, 2, true);
		Exercise.task1(3, 3, false);
		Exercise.task1(1, 1, true);
		System.out.println("  ");
		Exercise.flowchart(5678);
		System.out.println(" ");
		System.out.println("Blackjack:");
		Exercise.blackJack(21, 19);

	}
}

package com.qa.cond;

public class Exercise {

    public static void task1(int a, int b, boolean check) {

	int result = 0;

	if (check == true) {
	    result = a + b;
	} else {
	    result = a * b;
	}
	System.out.println(result);
    }

    public static void flowchart(int A) {

	if (A > 2000) {
	    System.out.println("A");
	    if (A > 6000) {
		System.out.println("C");
	    } else {
		System.out.println("B");
		if (A > 4000) {
		    System.out.println("D");
		} else {
		    System.out.println("E");
		}
	    }
	} else {
	    System.out.println("1");
	    if (A > 100) {
		System.out.println("3");
		if (A > 600) {
		    System.out.println("5");
		} else {
		    System.out.println("4");
		    if (A > 500) {
			System.out.println("6");
		    } else {
			System.out.println("7");
		    }
		}

	    } else {
		System.out.println("2");
	    }

	}

    }

    public static void blackJack(int a, int b) {

	int result = 0;

	if (a <= 21 && a > 0) {
	    if (b <= 21 && b > 0) {
		if (a > b) {
		    result = a;

		}
	    }
	}

	if (b <= 21 && b > 0) {

	    if (a <= 21 && a > 0) {

		if (b > a) {
		    result = b;
		}
	    }
	}

	System.out.println(result);
    }

}

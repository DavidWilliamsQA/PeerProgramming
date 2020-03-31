package com.qa.main;

public class Factorial {

	public static String check(int a) {

		int factorialInitial = a;
		int counter = 0;

		for (int i = 1; factorialInitial >= i; i++) {
			factorialInitial = factorialInitial / i;
			counter = i;
		}

		if (factorialInitial > 1) {
			return "NONE";
		}

		return Integer.toString(counter);
	}

}

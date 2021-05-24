package com.qa.examplejunit.calculator;

public class Calculator {
	private static int initial = 0;

	public static double add(int x, int y) {
		initial = x + y;
		System.out.println(initial);
		return initial;
	}
	
	public static double subtract(int x, int y) {
		initial = x-y;
		System.out.println(initial);
		return initial;
	}
	public static double divide(int x, int y) {
		initial = x/y;
		System.out.println(initial);
		return initial;
	}
	public static double multiply(int x, int y) {
		initial = x*y;
		System.out.println(initial);
		return initial;
	}
}

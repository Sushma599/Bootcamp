package com.Bridelab.bootcamp.day1;

public class SomeOfTwoDice {

	private static final double SIDES = 2;

	public static void main(String[] args) {
		 int a = 1 + (int) (Math.random() * SIDES);
	        int b = 1 + (int) (Math.random() * SIDES);
	        int sum = a + b;
	        System.out.println(sum);

	}

}

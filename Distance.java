package com.Bridelab.bootcamp.day1;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x");
		x = sc.nextInt();
		System.out.println("enter the value of y");
		y = sc.nextInt();
		double dist = Math.sqrt(x*x + y*y);
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
		

	}

}

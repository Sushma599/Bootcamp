package com.Bridelab.bootcamp.day1;

import java.util.Scanner;

public class Quadratic {
	
public static void main(String[] args) {
	double b,c;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of d");
	b = sc.nextDouble();
	System.out.println("enter the value of c");
	c = sc.nextDouble();
	double delta = b*b - 4.0*b*c;
    double sqrt =  Math.sqrt(delta);

    double root1 = (-b + sqrt(delta)) / 2*c;
    double root2 = (-b - sqrt(delta)) / 2*c;

    System.out.println(root1);
    System.out.println(root2);
	
}

private static double sqrt(double delta) {
	// TODO Auto-generated method stub
	return 0;
}
}

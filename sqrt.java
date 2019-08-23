package com.bridelabz.bootcamp.day2;

import java.util.Scanner;

public class sqrt {

	public static void main(String[] args) {
		double c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		c = sc.nextDouble();
		
		
		double epsilon = 1e-15;    
        double t = c;              

        
        while (Math.abs(t - c/t) > epsilon*t)
        {
            t = (c/t + t) / 2.0;
		

   	}
        System.out.println(t);
}
}

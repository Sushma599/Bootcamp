package com.bridelabz.bootcamp.day2;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		double n,i;
		System.out.println("enter the Harmonic value");
		
		Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();
        // compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double sum = 0.0;
        for ( i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.println(sum);
        }
        
		
	}

}

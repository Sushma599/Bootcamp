package com.bridelabz.bootcamp.day2;

import java.util.Scanner;

public class PoweOf2 {

	public static void main(String[] args) {
		

        double i=1 ,n;                
        int powerOfTwo = 1;       
     Scanner sc = new Scanner(System.in);
        System.out.println("enter the power value");
        n=sc.nextDouble();
        while (i <= n) {
            System.out.println( powerOfTwo);   
            powerOfTwo = 2 * powerOfTwo;                 
            i = i + 1;
        }

	}

}

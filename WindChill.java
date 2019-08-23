package com.bridelabz.bootcamp.day2;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		double t ;
        double v ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temp value...");
        t=sc.nextDouble();
        System.out.println("enter the wind value...");
        v = sc.nextDouble();
        if((t>0&&t<50) && (v>3&&v<120))
        {
        	double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        	System.out.println("Wind chill  = " + w);
        }
        else
        {
        	System.out.println("invalid input");
        }

	}
}

package com.bridelabz.bootcamp.day2;

import java.util.Scanner;

public class TemparatureConversion {
	

	public static void main(String[] args) {
		double f,c;
	
		Scanner I = new Scanner(System.in);
	
		System.out.print("Input a degree to celsius to  Fahrenheit: ");
        f = I.nextInt();
        c =  (f*9/5)+32;
        System.out.println("result of celcius="+c);
        System.out.print("Input a degree to Farenheit to  Celcius: ");
        f =  I.nextInt();
        f = (c-32)*5/9;
        System.out.print("result of farenheit: "+f);
	}
}
        
        		
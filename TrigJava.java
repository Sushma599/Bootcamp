package com.bridelabz.bootcamp.day2;

public class TrigJava {

	public static void main(String[] args) {
		double degrees = 45.0; 
		  
        // convert degrees to radians 
        double radians = Math.toRadians(degrees); 
  
        // sin() method to get the sine value 
        double sinValue = Math.sin(radians); 
        double cosValue = Math.cos(radians);
        double toRadians = Math.toRadians(radians);
        System.out.println("cos(" + degrees + ") = " + cosValue);
        System.out.println("sin(" + degrees + ") = " + sinValue);
        System.out.println("toRadians(" + degrees + ") = " + toRadians);

	}

}

package com.bridelabz.bootcamp.day2;

public class randomvalue {

	public static void main(String[] args) {
		double x1=Math.random();
		double x2=Math.random();
		double x3=Math.random();
		double x4=Math.random();
		double x5=Math.random();
		
		System.out.println("Random is x1=" +x1);
		System.out.println("Random is x2=" +x2);
		System.out.println("Random is x3=" +x3);
		System.out.println("Random is x4=" +x4);
		System.out.println("Random is x5=" +x5);
		double arg = x1+x2+x3+x4+x5/5;
		System.out.println("arg value" +arg);
		
		double max1 = Math.max(x1,x2);
		double max2 = Math.max(x3,x4);
		double max3 = Math.max(max1,max2);
		double max4 = Math.max(max3,x5);
		
		double min1 = Math.min(x1,x2);
		double min2 = Math.min(x3,x4);
		double min3 = Math.min(min1,min2);
		double min4 = Math.min(min3,x5);
		System.out.println("max value=" +max4);
		System.out.println("min value=" +min4);
		
		
		
		
	}

}

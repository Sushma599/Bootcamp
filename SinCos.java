package com.bridelabzz.bootcamp.day3;

import java.util.Scanner;
import java.lang.Math;
public class SinCos {
	
		    
			

			public static void main(String[] args) {
		    	Scanner sc = new Scanner(System.in);
		    	System.out.println("enter the angle");
		    	double s = sc.nextDouble();
		    	s=s%(2*Math.PI);
		    	double term = 1.0;
		    	double sum = 0.0;
		    	for (int i=1;term!=0.0;i++) {
		    		
		    		term = term*(s/i);
		    		if(i%4==1)
		    			sum+=term;
		    		if(i%4==3)
		    			sum-=term;
		    	}
		    	System.out.println(sum);
		    	sc.close();
		        
        }
		
		

	}



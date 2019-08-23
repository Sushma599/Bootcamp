package com.bridelabz.bootcamp.day2;

import java.util.Scanner;

public class GamblingSimulator {

	public static void main(String[] args) {
		double stake, goals, trails;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of the stakes");
		stake = sc.nextDouble();
		System.out.println("enter the value of the goals");
		goals = sc.nextDouble();
		System.out.println("enter the value of the trails");
		trails = sc.nextDouble();
		 int bets = 0;      
	        int wins = 0;  
	        for (int t = 0; t < trails; t++)
	        {
	        	 double cash = stake;
	             while (cash > 0 && cash < goals)
	             {
	            	 bets++;
	                 if (Math.random() < 0.5) 
	                	 cash++;     
	                 else   
	                	 cash--;
	             }

	             if (cash == goals)
	            	 wins++;
	        }
		
		
	        System.out.println(wins + " wins of " + trails);
	        System.out.println("Percent of games won = " + 100.0 * wins / trails);
	        System.out.println("Avg  bets           = " + 1.0 * bets / trails);

	}

}

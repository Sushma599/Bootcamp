package com.Bridelab.bootcamp.day1;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		
		int day,month;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month value");
		month = sc.nextInt();
		System.out.println("enter the day value");
		day = sc.nextInt();
		boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                || (month == 4 && day >=  1 && day <= 30)
                || (month == 5 && day >=  1 && day <= 31)
                || (month == 6 && day >=  1 && day <= 20);
		
		System.out.println(isSpring);
	}

}

package com.bridgelabzz.bootcamp.day4;

import java.util.Scanner;

public class Calender {
	 public static int day(int month, int day, int year)
	 {
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	    }
	 
	 public static boolean isLeapYear(int year) 
	 {
	        if  ((year % 4 == 0) && (year % 100 != 0))
	        	return true;
	        if  (year % 400 == 0) 
	        	return true;
	        return false;
	    }

	public static void main(String[] args) {
		int month = 1,year = 12,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month");
		   n = sc.nextInt();
		   System.out.println("enter the year");
		n= sc.nextInt();
		 String[] months = {
		            "",                               
		            "January", "February", "March",
		            "April", "May", "June",
		            "July", "August", "September",
		            "October", "November", "December"
		 };
		 int[] days = {
		            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		        };
		 if (month == 2 && isLeapYear(year)) days[month] = 29;
		 System.out.println("   " + months[month] + " " + year);
	        System.out.println(" S  M Tu  W Th  F  S");
	        int d = day(month, 1, year);

	        // print the calendar
	        for (int i = 0; i < d; i++)
	            System.out.print("   ");
	        for (int i = 1; i <= days[month]; i++) {
	            System.out.printf("%2d ", i);
	            if (((i + d) % 7 == 0) || (i == days[month]))
	            	System.out.println();
	}

}
}


package com.bridgelabzz.bootcamp.day4;



public class DayOfWeek {
	static int DayOfWeek (int d, int m, int y)
	{
		int t[] = { 0,3, 2,5, 0, 3, 5,1,4, 6, 2, 4};
		y -= ( m < 3 ) ? 1:0;
		return ( y+ y/4 -y/100 + y/400 + t[m-1] + d) % 7;
	}
	public static void main (String args[])
	{
		int day = DayOfWeek(21, 8 , 2019);
		System.out.print(day);
		
	}
}
	
	
		
	
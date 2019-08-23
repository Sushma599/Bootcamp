package com.Bridelab.bootcamp.day1;

public class LeapYear {

	static void isLeapYear(int year){
		System.out.println("enter the year");
        if(year<=1582){
            System.out.println("Invalid year entry");
            return;
        }
        boolean isLeap;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    isLeap = true;
                }else{
                    isLeap = false;
                }
            }else{
                isLeap = true;
            }
        }else{
            isLeap = false;
        }

        if(isLeap)
            System.out.println("Given year " + year +  " is leap year");
        else
            System.out.println("Given year " + year +  " is not leap year, its a common year");
    }
        

}

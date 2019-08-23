package com.bridelabzz.bootcamp.day3;

public class RollDie {

	public static void main(String[] args) {
		int SIDES = 6;   

        
        int roll = (int) (Math.random() * SIDES) + 1;

        
        System.out.println(roll);


	}

}

package com.bridelabzz.bootcamp.day3;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		num = sc.nextInt();
		 for(int  i = 2; i*i<num ; i++) {
	         while(num%i == 0) {
	            System.out.println(i+" ");
	            num = num/i;
	            if(num >2)
	            {
	            	System.out.println(num);
	            }
	         }
	      }
	}

}

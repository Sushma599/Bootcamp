package com.bridgelabzz.bootcamp.day4;
import java.util.Scanner;

public class PalindromeBoolean {

	public static void main(String[] args) {
		String rev=" ";
		Scanner sc = new Scanner(System.in);
	System.out.println("enter the main string");
	String  str = sc.nextLine();
	
	char[] c1 = str.toCharArray();
	for(int i=c1.length-1;i>=0;i--)
	{
		rev = rev + c1[i];
	}
	System.out.println(rev);
	if(str.equals(rev))
	{
		System.out.println("the given string is palindrome string:" +rev);
		
	}
	else
	{
		System.out.println("the gien string is not a palindrome:"+rev);
	}
	}
}
		
        
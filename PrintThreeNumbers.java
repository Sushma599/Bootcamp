package com.Bridelab.bootcamp.day1;

public class PrintThreeNumbers {

	public static void main(String[] args) {
		int i;
		String[] a = { "alice", "bob", "carol"};
		for(i=a.length-1; i>=0; i--)
		{
			System.out.println("the value is="+a[i]);
		}

	}

}

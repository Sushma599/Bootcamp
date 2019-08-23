package com.bridelabzz.bootcamp.day3;

public class SmallestLarge {

	public static void main(String[] args) {
		int[] a = {-5, -4, 0, 2, 10, 30, -3};
	    int smallest = 0;
	    int secondSmallest = 0;
	    System.out.println("The Given smallest  Element is:");
	    for (int i = 0; i < a.length; i++) 
	    {
	        if(a[i]==smallest)
	        {
	          secondSmallest=smallest;
	        } 
	        else if (a[i] < smallest) 
	        {
	            secondSmallest = smallest;
	            smallest = a[i];
	        } 
	        else if (a[i] < secondSmallest) 
	        {
	            secondSmallest = a[i];
	        }

	    }
	    System.out.println(secondSmallest);
	    
	    
		int[] b = new int[] { 20, 30, 50, 4, 71, 100};
		int max = b[0];
		for(int i = 1; i < b.length;i++)
		{
			if(b[i] > max)
			{
				max = b[i];
			}
		}
		
		System.out.println("The Given Array Element is:");
		for(int i = 0; i < b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("From The Array Element Largest Number is:" + max);

	}

}

package com.bridelabzz.bootcamp.day3;

public class SwapBinary {
	
	static int swapBinary(int num)
	{
		return ((num & 0x0F)<<4 | (num & 0x0F0)>>4 );
				}
	public void convertBinary(int num)
	{
		int binary[] = new int[40];
		int index =0;
		while(num>0)
		{
			binary[index++] = num%2;
			num = num/2;
		}
		for (int i= index-1;i>=0;i--)
		{
			System.out.print(binary[i]);
		}
	}

	public static void main(String[] args) {
		SwapBinary obj = new SwapBinary();
		System.out.println("binary representation of 10 is:");
		obj.convertBinary(1);
		System.out.println("/n the swapping of nibbles:"+swapBinary(1));
		

	}

}

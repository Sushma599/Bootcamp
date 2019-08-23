package com.bridgelabzz.bootcamp.day4;

import java.util.Arrays;

public class StringFunctions {
	

	static boolean StringFunctions(char[] str1, char[] str2) 
	{
        
        int n1 = str1.length; 
        int n2 = str2.length;
        if (n1 != n2) 
            return false; 
  
        // Sort both strings 
        Arrays.sort(str1); 
        Arrays.sort(str2); 
  
        // Compare sorted strings 
        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 
  
        return true; 
    } 
        
	public static void main(String[] args) {
		char str1[] = { 'h', 'e', 'a', 'r' , 't' }; 
        char str2[] = { 'E', 'a', 'r', 't' , 'h' }; 
        if (StringFunctions(str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 

	}

}

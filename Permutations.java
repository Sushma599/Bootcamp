package com.bridgelabzz.bootcamp.day4;

public class Permutations {
	private static void Permutations(String candidate, String remaining)
	{
		if (remaining.length() == 0) {
			System.out.println(candidate);
		}
		for (int i = 0; i < remaining.length(); i++)
		{
			String newCandidate = candidate + remaining.charAt(i);

			String newRemaining = remaining.substring(0, i) +
								  remaining.substring(i + 1);

			Permutations(newCandidate, newRemaining);
		}
	}
	public static void main(String[] args) {
		
		String s = "ABC";
		Permutations("", s);
	}
}

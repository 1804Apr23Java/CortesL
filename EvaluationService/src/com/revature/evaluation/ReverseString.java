package com.revature.evaluation;

import java.util.Scanner;
public class ReverseString {

	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	String sentence = "Hello World!";
	String word = "Hello";
	int decision;
	
	System.out.println("Reverse a word or a sentence?");
	System.out.println("1 for word, 0 for sentence");
	System.out.print("Choose: ");
	decision = sc.nextInt();
	
	
	//Decision
	if(decision==1)
	{
		char[] reversed = new char[word.length()];
		for (int i = reversed.length - 1, j = 0; i>=0; i--, j++)
		
		{
			reversed[j] = word.charAt(i);
			
		}
		System.out.println(reversed);
	}
	else
		if(decision==0)
		{
			char[] reversed = new char[sentence.length()];
			for (int i = reversed.length - 1, j = 0; i>=0; i--, j++)
			
			{
				reversed[j] = sentence.charAt(i);
				
			}
			System.out.println(reversed);
		}
		else
		{
			System.out.println("Wrong choice, please restart the application.");
			
	}
	
	
	
}
	
}

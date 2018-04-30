package com.revature.codechallenge;


import java.util.List;
import java.util.Scanner;

public class Producer {
	
	private static Scanner sc;
	public Producer()
	{
		super();
	}
	
	public List<String> putItems(List<String> basket)
	{
		String s;
		sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Welcome to the Producer's Sad Shack.");
		
		for(int i = 0; i < 10; i++) {
			if(basket.size() >= 0)
			{
				System.out.println("Please input the items you wish to add.");
				System.out.print("Items: ");
				s = sc.nextLine();
				basket.add(s);
			}
			else
			{
				System.out.println("Your basket is full.");
				break;
			}
		}
		System.out.println("Your items are: ");		
			System.out.println("Items: " + basket);	
		
		
		return basket;
	}

}

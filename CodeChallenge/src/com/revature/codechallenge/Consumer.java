package com.revature.codechallenge;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Consumer extends Producer {
	

	private static Scanner sc;
	public Consumer()
	{
	super();
	
	}
	
	public void getItems(List<String> basket)
	{
		int num = (int) (Math.random() * basket.size());
		
		sc = new Scanner(System.in);
		
		List<String> get = new ArrayList<String>();
		
		String getting;
		String seleccion;
		String elige;
		
		System.out.println();
		System.out.println("Welcome to the Consumer's Corner.");
		System.out.println("Would you like to see our list of items?");
		System.out.println("Input 'Yes' to see or 'No' to close this application.");
		System.out.print("Input: ");
		seleccion = sc.nextLine();
		if(seleccion.equals("Yes"))
		{
			if(basket.size() == 0)
			{
				System.out.println("Apologies, our inventories are empty.");
				System.out.println("Please try again later after our producers have added items.");
				System.exit(0);
			}
			
			System.out.println("Items #" + basket);	
			
		}
		else 
		{
			System.out.println("Program will now close.");
			System.exit(0);
		}
		
		System.out.println("Would you like to take home any of the items?");
		System.out.println("Warning: You'll be taking at random, if there is something you don't like "+
						"you might get it either way.");
		System.out.println("Input 'Yes' to take items with you. Or 'No' to close this program.");
		System.out.print("Input: ");
		elige = sc.nextLine();
		
		if(elige.equals("Yes") || elige.equals("yes"))
		{
			getting = basket.get(num);
			
			get.add(getting);
			
			System.out.println("Random: " + num);
			System.out.println("You're getting: " + get);
		}
		else
		{
			System.out.println("You've either chosen no, or type an input not accepted. Application will " +
							"close now, please try again.");
							System.exit(0);
		}
		
		
		
	}

}

package com.revature.codechallenge;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MainProCon {
	
	
	private static Scanner sc;
	public static void main(String[] args)
	{
		List<String> basket = new ArrayList<String>();
		
		
		String seleccion;
		sc = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to Cidal's Market.");
		System.out.println("Are you a producer or a consumer?");
		System.out.println("If a producer, please type 'Pro' into the console.");
		System.out.println("If a consumer, please type 'Con' into the console.");
		System.out.print("Input: ");
		seleccion = sc.nextLine();
		seleccion = seleccion.toLowerCase();
		
		
		
		if(seleccion.equals("pro") || seleccion.equals("Pro"))
		{
		Producer pro = new Producer();
		pro.putItems(basket);
		Consumer con = new Consumer();
		con.getItems(basket);
		
		}
		else if(seleccion.equals("con") || seleccion.equals("con"))
		{
			Consumer con = new Consumer();
			con.getItems(basket);
		}
		else
		{
			System.out.println("Wrong choice. The program will now close. Please try again.");
			System.exit(0);
		}
	}


}

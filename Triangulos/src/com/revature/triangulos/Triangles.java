package com.revature.triangulos;

import java.util.Scanner;
public class Triangles {
	
	private static Scanner sc;
	public static void main(String[] args)
	{
		
		//Declarations
		sc = new Scanner(System.in);		
		double sideOne;
		double sideTwo;
		double sideThree;

		System.out.println("Please type the length of the three sides of your triangle.");
		System.out.print("Side One: ");
		sideOne = sc.nextDouble();
		
		System.out.println();
		System.out.print("Side Two: ");
		sideTwo = sc.nextDouble();
		
		System.out.println();
		System.out.print("Side Three: ");
		sideThree = sc.nextDouble();
	
		
		//Methods
		isEquilateral(sideOne, sideTwo, sideThree);

		isIsosceles(sideOne, sideTwo, sideThree);

		isScalene(sideOne, sideTwo, sideThree);

		
		
	}

	private static void isEquilateral(double sideOne, double sideTwo, double sideThree) 
	{

		if(sideOne == sideTwo)
		{
			if(sideOne == sideThree)
			{
				System.out.println("This triangle is equilateral");
			}
		}
	
	}
	
	private static void isIsosceles(double sideOne, double sideTwo, double sideThree)
	{
		if(sideOne == sideTwo && sideOne != sideTwo)
		{
		
				System.out.println("This triangle is an isosceles");
			
		}
		else if(sideOne != sideTwo && sideOne == sideThree)
		{
		
				System.out.println("This triangle is an isosceles");
			
		}
		}
	
		
	
	private static void isScalene(double sideOne, double sideTwo, double sideThree)
	{
		if(sideOne!=sideTwo)
		{
			if(sideOne!=sideThree)
			{
				System.out.println("This triangle is a scalene");
			}
		}
			
		
	}
}


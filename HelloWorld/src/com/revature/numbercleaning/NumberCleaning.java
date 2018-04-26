package com.revature.numbercleaning;

import java.util.Scanner;



public class NumberCleaning {

		// Driver code
		
		public static void main(String[] args)
		{

		
				Scanner sc = new Scanner(System.in);
				String string;
				int areaCode;
				System.out.println("Reminder this service is only used phone numbers from the USA");
				System.out.println("USA phones country code will always be '1'");
				System.out.print("Please type your country code: ");
				areaCode = sc.nextInt();
				System.out.println();
				if(areaCode== 1)
				{
					System.out.println("Please type in your phone number with the area code as well.");
					System.out.println("Example: XXX-XXX-XXXX");
					System.out.print("Phone number: ");
					string = sc.next();
					System.out.println();
					string = string.replaceAll("[^0-9]", "");
					
					System.out.println("Your number is: " + string);
				}
				else
				{
					System.out.println("Wrong country code. Application will now end. Please try again.");
					System.exit(0);
					
				}
			}
				// TODO Write an implementation for this method declaration
				//return null;
			}



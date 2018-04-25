package com.revature.acronimos;
import java.util.ArrayList;
public class Acronimos {
	
	public static void main(String[] args)
	{
		
	
		String phrase = "Portable Network Graphics";
	
		
		ArrayList<String> list = new ArrayList<>();		
	
		//char acronym;
		
		char[] acronym = new char[(phrase.length())];
	
		for(int i = 0; i<=acronym.length-1; i++)
		{
			acronym[i] = phrase.charAt(i);
		
		if(acronym[i] =='P')
		{
			list.add("P");
			
		}
		else
			if(acronym[i] =='N')
			{
				list.add("N");
			}
			else
				if(acronym[i] =='G')
				{
					list.add("G");
					
				}
		}
		for (String item : list)
		{
			System.out.print(item);
		}
	}
}
	
		





package com.revature.threads;

public class Counter {
	
	private static int count=0;
	
	public static int getCount()
	{
		return count;
	}
	
	public static synchronized int incrementCount(int i)
	{
		i = count+=1;
		return count;
	}

}

package com.revature.threads;

public class MyThread extends Thread
{
	//Setting the Thread's name
	
	@Override
	public void run()
	{
		System.out.println("Hello from " + this.getName());
		this.setName("Threadding heh heh");
		System.out.println("My name is now." + this.getName());
		
		for (int i = 0; i<1000; i++)
		{
			Counter.incrementCount(i);
			System.out.println(this.getName() + "incremented value to " + i);
		}
		
	}

}

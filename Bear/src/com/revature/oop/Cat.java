package com.revature.oop;

public class Cat extends Animal implements Domestic {

	@Override
	String makeNoise()
	{
		return "Meow";
	}
	@Override
	public void pet()
	{
		System.out.println("Petting cat");
	}
	
}

package com.revature.oop;

public abstract class Animal {
	
	public Animal()
	{
	super();
	}
	
	public Animal(String name)
	{
		this();
		this.name = name;
	}
	public static String latinName = "Animalis";
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}

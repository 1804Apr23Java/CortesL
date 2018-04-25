package com.revature.hello;

public class Orange extends Fruit {

	public Orange()
	{
		super(); //Calling Fruit's no args contructor
	}
	
	public Orange(String variety)
	{
		this();//Implicitly inserted even if we leave it out
		this.variety = variety;
	}

	
	private String variety;
	
	public String getVariety()
	{
		return variety;
	}
	
	public void setVariety(String variety) {
		this.variety = variety;
		
	}
	
	
	//Overriding: providing a new implementation of an instance method in a subclass.
	//Need to have the same method signature as the superclass' method in order to override
	@Override
	public String toString() {
		return "Orange [variety=" + variety + "]";
	}
	

	//Code blocks
	//INSTANCE
	{
		System.out.println("This is an instance code block and will run when this class is instantiated");
		//runs before constructor
		
				
		
	}
	
	//static
	static {
		System.out.println("This is an instance of static code block and will run when this class passes through JVM");
	}
	
	
	

}

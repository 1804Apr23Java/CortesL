package com.revature.hello;

public class HelloWorld {
	
	public static void main(String[] args)
	{
		System.out.println("xd");
		
		Orange o = new Orange();
		
		o.setColor("Blue:");
		
		System.out.println("Orange o is " + o.getColor());
		
		o.setVariety("Valencia");
		
		System.out.println("Orange o is " + o.getVariety());
		
		//What about Object class?
		Object obj = new Object();
		System.out.println(obj.toString()); //Returns(prints) the fully qualified classname + address in memory 
		
		System.out.println(o.toString());
		
		//Equals and hash codes
		
		Fruit f1 = new Fruit();
		f1.setColor("Red");
		
		Fruit f2 = new Fruit();
		f2.setColor("green");
		
		Fruit f3 = new Fruit(); 
		f3.setColor("green");
		
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());//F2 and F3 will give the same results because its based on the properties.
		System.out.println(f3.hashCode());
		System.out.println(f1.equals(f2)); //False
		System.out.println(f2.equals(f3)); //True
		
	}
	

	}



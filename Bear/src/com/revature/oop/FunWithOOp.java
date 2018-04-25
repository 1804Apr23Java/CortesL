package com.revature.oop;

import java.util.ArrayList;
import java.util.List;

public class FunWithOOp {

	public static void main(String[] args)
	{
	Cat cat1 = new Cat();
	cat1.setName("Bagel");
	
	Bear bear1 = new Bear();
	bear1.setName("Barehands");
	List<Animal> animalList = new ArrayList<Animal>();
	
	animalList.add(cat1);
	animalList.add(bear1);
	
	System.out.println(animalList.toString());
	
	for (Animal a : animalList)
			if(a instanceOf Domestic)
			{
				((Domestic) a).pet();
			}
	
	
	}
}

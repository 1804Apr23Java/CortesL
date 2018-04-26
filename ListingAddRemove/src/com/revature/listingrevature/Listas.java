package com.revature.listingrevature;

public class Listas {
	Object[] list;
	
	public Listas() {
		this.list = new Object[100];
	}
	
	public boolean add(Object o, int i) {
		if(this.list[i] == null) {
			this.list[i] = o;
			return true;
		} else {
			return false;
		}
	}
	
	public Object retrieve(int index)
	{
		
		return null;
		
	}
	
}

package com.revature.listingrevature;



public class Listas {
	Object[] list;
	
	public Listas() {
		this.list = new Object[100];
	}
	
	public void add(Object o, int i) {
		if(i >= this.list.length) {
			growArray(i);
		}
		
		if(this.list[i] == null) {
			this.list[i] = o;
		} else {
			Object val = o;
			int j = i;
			for(; j < this.list.length; j++) {
				Object temp = this.list[j];
				this.list[j] = val;
				val = temp;
			}
			
			if(val != null) {
				growArray();
				this.list[j] = val;
			}
		}
	}
	
	private void growArray() {
		Object[] newArray = new Object[this.list.length * 2];
		
		for(int i = 0; i < this.list.length; i++) {
			newArray[i] = this.list[i];
		}
		this.list = newArray;
	}
	
	private void growArray(int length) {
		Object[] newArray = new Object[length + 1];
		
		for(int i = 0; i < this.list.length; i++) {
			newArray[i] = this.list[i];
		}
		this.list = newArray;
	}
	
	public Object retrieve(int index) {
		if(index < this.list.length) {
			return this.list[index];
		} else {
			return null;		
		}
	}
	
	public void remove(int index) {
		if(index < this.list.length) {
			this.list[index] = null;
		}
	}
}

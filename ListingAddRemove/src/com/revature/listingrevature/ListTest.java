package com.revature.listingrevature;
//Credit goes to Ian.
//Me, Luis, was not able to code anything.


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class ListTest {
	private Listas l;
	
	@Before
	public void setList() {
		this.l = new Listas();
	}
	
	@Test
	public void testAddToList() {
		this.l.add("Hello", 0);
		assertEquals("Hello", this.l.retrieve(0));
	}
	
	@Test
	public void testGrowList() {
		this.l.add("hello", 99);
		this.l.add("bye", 99);
		assertEquals("hello", this.l.retrieve(100));
		assertEquals("bye", this.l.retrieve(99));
	}
	
	@Test
	public void testGrowListAgain() {
		this.l.add("grow a lot",  500);
		assertEquals("grow a lot", this.l.retrieve(500));
	}
	
	@Test
	public void testRemove() {
		this.l.add("Here", 0);
		assertEquals("Here", this.l.retrieve(0));
		
		this.l.remove(0);
		assertEquals(null, this.l.retrieve(0));
	}
}

package com.revature.listingrevature;
//Credit goes to Ian.
//Me, Luis, was not able to code anything.


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

public class ListTest {
	private Listas l;
	
	@Before
	public void setList() {
		this.l = new Listas();
	}
	
	@Test
	public void testAddToList() {
		assertTrue(this.l.add("Hello", 0));
	}
	
	@Test
	public void testRetrieveFromList() {
		assertEquals("Hello", (String) this.l.retrieve(0));
	}

}

package com.stackroute.demo.pe2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerTest {

	
	@Test
	public boolean ReaminderTest() {
		Power obj=new Power();
		boolean x=obj.Remainder(216);
		assertEquals("true",x);
		return x;
		}
	@Test
	public boolean DivisbleTest() {
		Power obj1=new Power();
		boolean n=obj1.Remainder(215);
		assertEquals("false ",n);
		return n;
	}
	

}

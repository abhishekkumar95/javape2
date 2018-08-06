package com.stackroute.demo.pe2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {
    Factorial obj=new Factorial();

	@Test
	public void factTest() {
		assertEquals(3628800,obj.longFactorial(10));
		assertEquals(1, obj.longFactorial(1));
		assertEquals(120, obj.longFactorial(5));
	}
	
	@Test
	public void factFailure() {
		assertNotEquals(62270208, obj.longFactorial(1));
		assertNotEquals(62270208, obj.longFactorial(13));
		assertNotEquals(62270208, obj.longFactorial(13));
	}
	}



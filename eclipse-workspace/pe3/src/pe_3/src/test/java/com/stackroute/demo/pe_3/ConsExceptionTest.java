package com.stackroute.demo.pe_3;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ConsExceptionTest {
	
	private static  ConsException cons;
	int arr[]= {11,12,13,56};
     int size=arr.length;
	
	@BeforeClass
	public static void setup() {
	cons = new ConsException();	}
	
	@Test
	public void testSizeNegative() {
		String accpt=cons.sizeNegative(-2);
		assertEquals("null",accpt);}
	
	@Test 
	public void testNullPointer() {
		String accpt=cons.nullPointer(null, 0);
		assertEquals("null",accpt);
		
	}
	
	@Test
	public void testOutOfBound() {
		String accpt=cons.outofbound(arr, size);
		assertNotEquals(5,accpt);
	}
}

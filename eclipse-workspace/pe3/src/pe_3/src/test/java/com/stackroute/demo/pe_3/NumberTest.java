package com.stackroute.demo.pe_3;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class NumberTest {
	private static Number num;

	String expected="91,92,93,94,95,96,97";
	int explen=expected.length();
	
	@BeforeClass
	public static void setup() {
	num = new Number();	
	
	
	}
	

	@Test
	public void test() {
		boolean accpt=num.numcheck("91,92,93,94,95,96,97");
				assertEquals(true,expected);
		
		
	}
	@Test
	public void test1() {
		assertNotEquals(true,explen);
	}
	
	

}

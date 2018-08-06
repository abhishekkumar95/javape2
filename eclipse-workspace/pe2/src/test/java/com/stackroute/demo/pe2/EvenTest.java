package com.stackroute.demo.pe2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvenTest {

	@Test

	public void EvenTest1() {
       Even obj=new Even();
       boolean x=obj.Even();
       assertEquals("true",x);}
	
	
	@Test
	public void EvenTest() {
		Even obj=new Even();
		boolean x=obj.Even();
		assertNotEquals("ture",x);}
		
	}
       

	







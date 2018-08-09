package com.stackroute.demo.pe_3;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ChessTest {
	
	private static Chess ch;
	String[][] expected = {{"WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","BB|","WW|","BB|","WW|","BB|"},
            {"WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","BB|","WW|","BB|","WW|","BB|"},
            {"WW|","BB|","WW|","BB|","WW|","BB|"},
            {"BB|","BB|","WW|","BB|","WW|","BB|"},
            {"WW|","BB|","WW|","BB|","WW|","BB|"},
            {"WBB|","BB|","WW|","BB|","WW|","BB|"}};


	int len=expected.length;
	@Before
	public static void setup() {
		ch=new Chess();
	}

	@Test
	public void test() {
		assertEquals(8,len);
		assertEquals(true,expected);}
@Test
public void test1() {
	assertNotEquals(true,len);
	
}


	}
	
	

package com.stackroute.demo.pe2;

import static org.junit.Assert.*;

import org.junit.Test;

public class classInsTest {

	@Test
    public void classInsTest() 
    {   classIns obj=new classIns();
        assertEquals("Harry Potter 30 2500.3",obj.classIns());
        assertNotEquals("Harry ",obj.classIns());
        assertNotNull(obj.classIns());
        
    }
	}



package com.stackroute.demo.pe2;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class PalindromeTest {
    private static Palindrome p;

    @BeforeClass
    public static void setup()
    {
        p=new Palindrome();
    }
    @AfterClass
    public static void teardown()
    {
        p=null;
    }
    
    //@SuppressWarnings("deprecation")
    
    @Test
    public void test1() 
    {
        int result=p.compute(23211);
        assertEquals(23232,result);
    }
    public void test2() 
    {
        int result=p.compute(1441);
        assertEquals(1441,result);
    }
    public void test3() 
    {
        Palindrome p=new Palindrome();
        int result=p.compute(832238);
        assertEquals(832238,result);
    }
    public void test() {
        fail("Not yet implemented");
    }

}


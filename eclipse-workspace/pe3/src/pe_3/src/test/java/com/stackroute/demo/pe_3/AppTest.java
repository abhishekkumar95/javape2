package com.stackroute.demo.pe_3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest {
private static App a;

	@BeforeClass
	public static void setup() {
		 a = new App();

	}

	@AfterClass
	public static void teardown() {
		a = null;

	}
	StudentMarks a8=new StudentMarks();
	@Test
	public void testStudent() {
		int[] arr1={50};
		assertEquals(arr1, a8.stgrad(arr1));
    }
	StudentMarks a9=new StudentMarks();
	@Test
	public void testStudentfailure() {
		int[] arr={0};
		assertNotEquals(new String(""), a9.stgrad(arr));
    }
	AddTwoMat a1=new AddTwoMat();
	@Test	
    public void testMatrix() {
		int [][] int1= {{1, 2},{ 3 ,4 }};
		int [][] int2= {{1, 2},{ 3 ,4 }};
	    int [][] arr={{2,4},{6,8}};
		assertArrayEquals(arr , a1.isSum(int1,int2));
	}
	AddTwoMat a2=new AddTwoMat();
	@Test	
    public void testMatrixFailure() {
		int [][] int1= {{1, 2},{ 3 ,4 }};
		int [][] int2= {{1, 2},{ 4 ,4 }};
	    int [][] arr={{2,4},{6,8}};
	    
	    assertNotEquals(arr, a2.isSum(int1,int2));
		
	} 
	Day d=new Day();
	@Test
	public void testDay() {
		assertEquals(new String[] {"Mon 24/07/2017","Sun 30/07/2017"},d.isDay());
	}
	
	@Test
	public void testDayFailure() {
		assertNotEquals(new String[] {"Mon 24/07/2017","Sun 30/07/2017"},d.isDay());
	}
	Vowel vol=new Vowel();
	String [] z1= {"India","united states","germany"};
	
	@Test
    public void testPlaces() {
	    assertEquals(new String[] {"nd","Untd Stts","Grmny"}, vol.isVowel(z1));
    }

	
	
	Vowel vol1=new Vowel();
	String [] z= {"India","united states","germany"};
	@Test
    public void testPlacesFailure() {
	     assertNotEquals(new String[] {"nd","Untd Stts","Grmny"}, vol1.isVowel(z));
	}}
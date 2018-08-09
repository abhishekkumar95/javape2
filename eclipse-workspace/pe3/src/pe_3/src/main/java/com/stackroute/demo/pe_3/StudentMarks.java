package com.stackroute.demo.pe_3;

public class StudentMarks {
	
	int numberofstudent;
	int[] stu= {};
	
	public String stgrad(int stu[]) {
		for(int i=0;i<stu.length;i++) {
	try {
		if(stu[i]<0||stu[i]>100)
			throw new Exception("error message");
		  
	}
	catch(Exception e) {
		return e.getMessage();
	
		}
		
	}
		return null;
}}

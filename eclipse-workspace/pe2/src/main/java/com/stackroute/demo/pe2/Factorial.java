package com.stackroute.demo.pe2;

public class Factorial {
	public long longFactorial(long n) {
		if(n==1)
			return n;
		else
			return (n * longFactorial(n-1));
	}

}

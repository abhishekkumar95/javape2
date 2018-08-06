package com.stackroute.demo.pe2;

public class Power {
	
	public boolean Remainder(int n) {
		if(n%4 == 0) {
			if(n/4 == 1)
	 			return true;
			return Remainder(n/4);
		}
		return false;
	}

}

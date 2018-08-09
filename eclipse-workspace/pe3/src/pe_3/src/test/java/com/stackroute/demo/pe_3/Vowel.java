package com.stackroute.demo.pe_3;

public class Vowel {
	public String[] isVowel(String[] z) {
		int len=z.length;
		String str=new String();
		for(int i=0;i<len;i++) {
			str=z[i].replaceAll("[aeiou]","");
			z[i]=str;
		}
		return z;
	}

}

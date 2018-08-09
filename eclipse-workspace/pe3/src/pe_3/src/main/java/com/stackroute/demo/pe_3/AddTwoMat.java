package com.stackroute.demo.pe_3;

import java.util.Scanner;

public class AddTwoMat {
	

	public int[][] isSum(int[][]c,int [][]d){
		int [][] arr=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++)
				arr[i][j]=c[i][j]+d[i][j];
				}
		
		return arr;
		
	}}
	

package com.fact;

import java.util.Scanner;

public class PerfectSquare {
	
	private static void PerfectSq(int num) {
		
	 int square = (int) Math.sqrt(num);
	 int count =0;
	
	 System.out.println("Get Sqaure Root of Number " +square);
	 
	 for(int i=1;i<=square-1;i++) {
		 
		int sqr = (int) Math.pow(i,2);
		System.out.println("The Number of sqr "+sqr);
		
		 count++;
	 }
	 
	 System.out.println("The Number of count : "+count);
	 
	}
	
	
	static int sq(int num) {
	return (int) Math.sqrt(num-1);
	}
	
	public static void main(String[] args) {
		
		
		 Scanner s = new Scanner(System.in);
	     System.out.println("Enter a Number:");
	     int num = s.nextInt();
		
	     PerfectSq(num);
	     int res = sq(num);
	     System.out.println(res);
		
	}


}

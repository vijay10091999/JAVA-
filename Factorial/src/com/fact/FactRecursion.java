package com.fact;

import java.util.Scanner;

public class FactRecursion {

	public static void main(String[] args) {
		// factorial using recusrion
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result  = fact(n);
		System.out.println("Factorial of " + n + " is " + result);

	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		
//		if(n == 1 || n == 0)
//			return 1;
//		else
//			return n * fact(n-1);
		
		 return n == 0 || n == 1 ? 1 : n*fact(n-1);
		
	}

}

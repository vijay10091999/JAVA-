package com.fact;

public class FactWhileLoop {

	public static void main(String[] args) {
		// factorial using while loop
		
		int i = 1;
		
		int n =5;
		int fact =1;
		while(i <= n) {
			fact = fact * i;
			i ++;
		}
		System.out.println("Factorial of " + n + " is " + fact);
	}

}

package com.fact;

public class FactDoWhileLoop {

	public static void main(String[] args) {
		// factorial using do while loop
		
		int i =1;
		int fact = 1;
		int n = 6;
		do {
			fact = fact * i;
			i++;
		}while(i <= n);
		System.out.println("Factorial of " + n + " is " + fact);
	}

}

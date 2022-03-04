package com.fact;

import java.util.Scanner;

public class FactForLoop {

	public static void main(String[] args) {
		// factorial by for loop
		
		long fact = 1;
		// take input from user
		
		System.out.print("Enter your number :");
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		
		for(int i=1; i <= n ; i++) {
			fact = fact *i;
		}
		System.out.print("factorial of " + n + " is " + fact);
	}

}

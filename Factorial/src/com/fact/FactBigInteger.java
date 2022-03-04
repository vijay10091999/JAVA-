package com.fact;

import java.math.BigInteger;

public class FactBigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 30;
		
		BigInteger fact = BigInteger.ONE;
		
		for(int i = 1; i <= n ; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Factorial of " + n + " is " + fact);

	}

}

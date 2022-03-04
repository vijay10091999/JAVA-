package com.fact;

import java.math.BigInteger;
import java.util.Scanner;

public class RecursionBigInteger {

	public static void main(String[] args) {
		// factorial using recursion with big integer
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		BigInteger result = fact(n);
		System.out.println("Factorial of " + n + " is " + result);

	}

	private static BigInteger fact(int n) {
		// TODO Auto-generated method stub
		
//		if(n.equals(BigInteger.ONE) || n.equals(BigInteger.ZERO))
//			return BigInteger.ONE;
//		else
//			return n.multiply(fact(n.subtract(BigInteger.ONE)));
		
		return n == 0 || n ==1 ? BigInteger.ONE : BigInteger.valueOf(n).multiply(fact(n-1));
		
		
	}

}

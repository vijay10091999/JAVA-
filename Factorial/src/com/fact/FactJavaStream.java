package com.fact;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FactJavaStream {

	public static void main(String[] args) {
		// Factorial using java 8 stream method
		
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		long result = fact(n);
		System.out.println("Factorial of " + n + " is " + result);

	}

	private static long fact(int n) {
		// TODO Auto-generated method stub
		
		return LongStream.rangeClosed(1, n).reduce(1,(long x,long y) -> x*y);
		
	}

}

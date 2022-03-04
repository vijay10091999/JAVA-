package com.java8;


//want to make this interface as Functional Interface. To use LambdaExpression we need functionalInterface
/*
* only one abstract method should be there
*/


@FunctionalInterface 							// this anotations makes sure that only one abstract is present in interface
public interface FunctionalServices {
	static int square(int n1) {
		return n1 * n1;
	}
	int SquareOfMethod(int n1);
	
}


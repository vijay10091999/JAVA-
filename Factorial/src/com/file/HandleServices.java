package com.file;

public class HandleServices {
	int a, b;
	interface calculations {
		int Add();

		int Sub();

		int Mul();

		int Div();
	}

	
	public int Add(int a,int b) {

		return a+b;

	}
	
	public int Sub(int a,int b) {

		return a-b;

	}
	
	public int Mul(int a,int b) {

		return a*b;

	}
	
	public int Div(int a,int b) {

		return a/b;

	}

	
}

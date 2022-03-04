package com.programs;

public class test {

	public void m1(int i, float f) {
		System.out.println("int float method");
	}
	public void m1(float f, int i) {
		System.out.println("float int method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 test t = new test();
 t.m1(20,20);
	}

}

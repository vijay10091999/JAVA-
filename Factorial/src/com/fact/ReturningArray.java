package com.fact;

public class ReturningArray {

	public static void main(String[] args) {
     
		int arr[]= get();
		
		for(int i : arr) {
			System.out.println(i);
		}

	}

	private static int[] get() {
		// TODO Auto-generated method stub
		return new int[] {12,23,34,35};
	}

}

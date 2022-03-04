package com.swap;

public class SwapMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.out.println("Before swap");
		int first_num = 34 ; 
		int second_num =23 ;
		int Temp;
		
		System.out.println("Swap Number is : " +first_num + " " +second_num);
		System.out.println("After swap");
		Temp = first_num;
		first_num = second_num;
		second_num = Temp;
		
		System.out.println("Swap Number is : " +first_num + " " +second_num);
		
	}

}

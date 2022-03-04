package com.swap;

public class SwapMethod2 {

	    public static void main(String[] args) {

	        int first_num = 99, second_num = 66;

	        System.out.println("Before swap");
			System.out.println("Swap Number is : " +first_num + " " +second_num);

	        first_num = first_num - second_num;
	        second_num = first_num + second_num;
	        first_num = second_num - first_num;

	        System.out.println("After swap");
			System.out.println("Swap Number is : " +first_num + " " +second_num);

	    }
	}
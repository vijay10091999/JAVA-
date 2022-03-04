package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElementArray {


	public static void main(String[] args) {
		

		 int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3}; 
		   System.out.println(arr.length);
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = 0; j < arr.length-1; j++) {  
	                if(arr[i] == arr[j+1])  
	                 System.out.println(arr[j]);  
	            }  
	        }  
	    }   
}

	


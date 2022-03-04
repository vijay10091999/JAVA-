package com.fact;

import java.util.Arrays;

public class Array {

	
	static int[] minAndmax(int a[]){
		
		
		
		int[] array= new int[2];
		array[0] = a[0]; // min
		array[1] = a[1];
		
		for(int i: a)
		{
			if(array[0]<i) 
			{
				array[0] = i;
             	return array;
			}
		
		    if(array[1] > i)
		    {
		    	array[1] = i;
		    	return array;
		    }
		}
		return array;

	}
	
	public static void main(String[] args) {
		
		
		int arr[] = {2,0,11,10}; // intitalize 
		
		
		//calling the method 
		int[] res= minAndmax(arr);
		System.out.println(" max : " +  res[0] + " min: " + res[1]);

		
//		Arrays.sort(arr); // O(nlogn)
//		System.out.println("min : " + arr[0] + " max : " + arr[arr.length-1]);
		
	}

}

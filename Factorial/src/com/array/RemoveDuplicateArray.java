package com.array;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		 
		for(int k=0;k<arr.length;k++) {
			//System.out.println(arr[k]);
		}
		RemoveDuplicate(arr);
	        

	}

	private static int[] RemoveDuplicate(int a[]) {
		
		
		
		for(int i = 0; i < a.length; i++) {  
            for(int j = i+1; j < a.length; j++) {  
                if(a[i]!= a[j])  
                    System.out.println(a[j]);  
            }  
        }
		return a;  
		
	}

}

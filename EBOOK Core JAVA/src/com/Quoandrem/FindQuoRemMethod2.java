package com.Quoandrem;

import java.util.Scanner;

public class FindQuoRemMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.out.println("Enter the value num1 and num2");  
		    Scanner s = new Scanner(System.in);  
		    int num1 = s.nextInt();  
		    System.out.println("Enter the value of num1 : " +num1);
		    int num2 = s.nextInt();  
		    System.out.println("Enter the value of num2 : " +num2);
		    int quotient = 0, remainder = 0;  
		  
		    
		      
		    quotient = num1 / num2;  
		  
		    remainder = num1 % num2;  
		  
		    System.out.println("Get Quotient of Number: " + quotient); 
		    
		    System.out.println("Get Remainder of Number: " + remainder);  
		    }  
		}
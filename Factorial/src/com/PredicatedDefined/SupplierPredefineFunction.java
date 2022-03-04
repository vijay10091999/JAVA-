package com.PredicatedDefined;

import java.util.function.Supplier;

public class SupplierPredefineFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Supplier<String> OTP = () ->{
	 String n1 = "";
	 for(int i=0;i<6;i++) {
		 n1 = n1+(int)(Math.random()*10);
	 }
	return n1;
	 
 };
 System.out.println(OTP.get());
	}

}

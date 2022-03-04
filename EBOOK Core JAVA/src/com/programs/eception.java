package com.programs;

public class eception {
	
	public static void aMethod() throws Exception{
		try {
			/* Line5*/ throw new Exception ();/* Line6*/ 
		}finally {
			/* Line5*/ System.out.println("finally");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	aMethod();
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("exception");
}
System.out.println("finsihes");
	}

}

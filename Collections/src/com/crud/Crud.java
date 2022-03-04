package com.crud;


import java.util.Iterator;
import java.util.Scanner;

import com.crud.service.CrudServiceImp;
import com.crud_model.Employee;



public class Crud {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.print("Enter Your Choice : ");
		    ch = scan.nextInt();
		    CrudServiceImp c = new CrudServiceImp();
		    switch(ch) {
		    case 1:
		    	
		    	
		    	 boolean Res_insert = c.insert();
		    	 if(Res_insert)
		    		 System.out.println("Data Inserted Succcessfully");
		    	 else
		    	 System.out.println("None");
		    break;
		   
//		    case 2:
//		     System.out.println("----------------------");
//		     
//		     Iterator <Employee> i = c.iterator();
//		     while(i.hasNext()) {
//		    	 Employee e = i.next();
//		    	 System.out.println(e);
//		     }
//		       System.out.println("----------------------");
//
//		    break;
//		  
//		    
//		case 3:
//			boolean found = false;
//			System.out.println("Enter Employee Number to Search :");
//		   
//		    
//		   int  Employee_No = scan.nextInt();
//		   System.out.println("----------------------");
//		     i= c.iterator();
//		     while(i.hasNext()) {
//		    	 Employee e = i.next();
//		    	 if(e.getEmpno()==Employee_No) {
//		    		 System.out.println(e);
//		    		 found= true;
//		    	 }	
//		     }
//		     
//		       if(!found) {
//		    	   System.out.println("Record Not found");
//		       }
//		       System.out.println("----------------------");
//		    break;
//		    
//		case 4:
			boolean found = false;
			System.out.println("Enter Employee Number to Search :");
			 Iterator <Employee> i = c.iterator();
		    
		   int  Employee_No = scan.nextInt();
		   System.out.println("----------------------");
		     i= c.iterator();
		     while(i.hasNext()) {
		    	 Employee e = i.next();
		    	 if(e.getEmpno()==Employee_No) {
		    		 System.out.println(e);
		    		 found= true;
		    	 }	
		     }
		     
		       if(!found) {
		    	   System.out.println("Record Not found");
		       }
		       System.out.println("----------------------");
		    break;
		    }
		}while(ch!=0);
		
	}
}
	

		
	


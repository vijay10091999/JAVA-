package com.crud.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.crud_model.Employee;

public class CrudServiceImp implements CrudServices {
	
	Collection<Employee> c = new ArrayList<Employee>();
	Scanner scan = new Scanner(System.in);


	public boolean insert() {
		// TODO Auto-generated method stub
		System.out.print("Enter Employee Number :");
    	int Emp_no = scan.nextInt();
    	System.out.print("Enter Employee Name :");
    	String Emp_name = scan.next();
    	System.out.print("Enter Employee Salary :");
    	int Emp_salary = scan.nextInt();
    	
    	c.add(new Employee(Emp_no,Emp_name,Emp_salary));
		return true;
	}

	

	@Override
	public int search() {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Number to Search :");
		int  Employee_No = scan.nextInt();
		return Employee_No;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}


//
//	@Override
//	public Employee display(Employee e) {
//		// TODO Auto-generated method stub
//		return e;
//	}

	
	
}

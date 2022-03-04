package com.crud_model;

public class Employee {
	
		private int Employee_No;
		private String Employee_Name;
		private int salary;
		
		public Employee (int Employee_No,String Employee_Name,int salary){
			this.Employee_No =Employee_No;
			this.Employee_Name=Employee_Name;
			this.salary=salary;
		}
		public int getEmpno() {
			return Employee_No;
		}
		public int getsalary() {
			return salary;
		}
		public String getEname() {
			return Employee_Name;
		}
		@Override
		public String toString() {
			return Employee_No + " ," + Employee_Name + ","+ salary;
		}
		
	}



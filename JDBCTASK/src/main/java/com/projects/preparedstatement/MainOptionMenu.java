package com.projects.preparedstatement;

import java.sql.SQLException;
import java.util.Scanner;

public class MainOptionMenu {
	    
	public static void main(String[] args) throws SQLException {
		Scanner in = new Scanner(System.in);
		
		
		
 while(true) {
		

		System.out.println("1\t Insert values in Table");
		System.out.println("2\t Select values in Table\"");
		
		System.out.println("3\t Update values in Table\"");
		System.out.println("4\t Delete values in Table\"");

		System.out.println("Please enter your choice:");
		// Get user's choice
		int choice = in.nextInt();

		StudentDao d = new StudentDao();

		// Display the title of the chosen module
		switch (choice) {
		case 1:
			int r = d.insertRecord(getinput(in));
			if(r!=0) {
				System.out.println("Data inseted successfully.");
			}
			break;
		case 2:
			d.ShowAllRecords();
			break;
		case 3:
			int re =d.updateRecord(getinput(in));
			if(re!=0) {
				System.out.println("Data uploaded successfully.");
			}
			break;
		case 4:
			System.out.println("Enter your id ");
			int id = in.nextInt();
			int ree = d.deleteRecord(id);
			if(ree!=0) {
				System.out.println("Data delelted successfully.");
			}
			break;
		default:
			System.out.println("Invalid choice");
		}// end of switch
	}// end of the main method



	}

	private static Student getinput(Scanner in) {
		System.out.println("Enter your id ");
		int id = in.nextInt();
		System.out.println("Enter your name ");
		String name = in.next();
		System.out.println("Enter your email ");
		String email = in.next();
		System.out.println("Enter your country ");
		String country = in.next();
		System.out.println("Enter your password ");
		String password = in.next();
		Student st = new Student(id,name,email,country, password);
		return st;
	}
	}


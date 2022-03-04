package com.projects.statement;

import java.sql.SQLException;
import java.util.Scanner;

public class MainOptionMenu {
	    
	public static void main(String[] args) throws SQLException {

		while(true){
		Scanner in = new Scanner(System.in);
		// Display the menu
		System.out.println("1\t Create Table");
		System.out.println("2\t Insert values in Table");
		System.out.println("3\t Select values in Table\"");
		System.out.println("4\t Update values in Table\"");
		System.out.println("5\t Delete values in Table\"");

		System.out.println("Please enter your choice:");
		// Get user's choice
		int choice = in.nextInt();

		StudentDao d = new StudentDao();

		// Display the title of the chosen module
		switch (choice) {
		case 1:
			d.createTable();
			break;
		case 2:
			d.insertRecord();
			break;
		case 3:
			d.ShowAllRecords();
			break;
		case 4:
			d.updateRecord();
			break;
		case 5:
			d.deleteRecord();
			break;
		default:
			System.out.println("Invalid choice");
		}// end of switch
	}// end of the main method
	}
}

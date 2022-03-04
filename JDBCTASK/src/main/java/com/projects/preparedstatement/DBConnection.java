package com.projects.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	
	private static Connection con;
	public static Connection createcon() {
		
		try {
			
			
			if(con==null) {
				
				// driver class load 
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//craete a connection ..
				
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/vijay1","root","Lufa@7917");
				
			}
	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		return con;
	}
}

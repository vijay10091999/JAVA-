package com.dbconnection;
import java.sql.*; 

public class DBConnectionWithoutDSN {
	   static final String DB_URL = "jdbc:mysql://localhost:3306/vijay1";
	   static final String USER = "root";
	   static final String PASS = "Lufa@7917";
	   static final String QUERY = "SELECT * FROM Employees";


	   public static void main(String[] args) {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	         ResultSet rs = stmt.executeQuery(QUERY);) {
	         // Extract data from result set
	         while (rs.next()) {
	            // Retrieve by column name
	        	 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	}

		

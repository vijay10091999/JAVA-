package com.resultsetinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


//Example ->Retrieving Column Values from Rows

public class SelectUsingExecuteQuery {
	 private static final String QUERY = "select id,name,email,country,password from users2";

	    public static void main(String[] args) {

	        // using try-with-resources to avoid closing resources (boilerplate code)

	        // Step 1: Establishing a Connection
	        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vijay1?useSSL=false",
					"root", "Lufa@7917");
	            // Step 2:Create a statement using connection object
	            Statement stmt = connection.createStatement();

	            // Step 3: Execute the query or update query
	            ResultSet rs = stmt.executeQuery(QUERY)) {

	            // Step 4: Process the ResultSet object.
	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                String email = rs.getString("email");
	                String country = rs.getString("country");
	                String password = rs.getString("password");
	                System.out.println(id + "," + name + "," + email + "," + country + "," + password);
	            }
	        } catch (SQLException e) {
	           
	        }
	        // Step 4: try-with-resource statement will auto close the connection.
	    }
}

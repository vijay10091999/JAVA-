package com.projects.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.projects.statement.DBConnection;


public class StudentDao {



Connection connection = DBConnection.createcon();

	public void createTable() throws SQLException {
	String createTableSQL = "create table student(\r\n" + "  id  int(3) primary key,\r\n"
				+ "  name varchar(20),\r\n" + "  email varchar(20),\r\n" + "  country varchar(20),\r\n"
				+ "  password varchar(20)\r\n" + "  );";

		System.out.println(createTableSQL);
		// Step 1: Establishing a Connection

				// Step 2:Create a statement using connection object
				Statement statement = connection.createStatement();

			// Step 3: Execute the query or update query
			statement.execute(createTableSQL);
		

		// Step 4: try-with-resource statement will auto close the connection.
	}

	public void insertRecord() throws SQLException {
		  String INSERT_MULTIPLE_USERS_SQL = "INSERT INTO student "
					+ "VALUES (3, 'Pramod', 'pramod@gmail.com', 'India', '123'),"
					+ "(4, 'Deepa', 'deepa@gmail.com', 'India', '123')," + "(5, 'Tom', 'top@gmail.com', 'India', '123');";
	
		// Step 1: Establishing a Connection

				// Step 2:Create a statement using connection object
				Statement statement = connection.createStatement();

			// Step 3: Execute the query or update query
			int result = statement.executeUpdate(INSERT_MULTIPLE_USERS_SQL);
			System.out.println("No. of records affected : " + result);
		
		// Step 4: try-with-resource statement will auto close the connection.
	}

	public void ShowAllRecords() throws SQLException {
	     String QUERY = "select id,name,email,country,password from student";

	
				// Step 2:Create a statement using connection object
				Statement stmt = connection.createStatement();

				// Step 3: Execute the query or update query
				ResultSet rs = stmt.executeQuery(QUERY);

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				String password = rs.getString("password");
				System.out.println(id + "," + name + "," + email + "," + country + "," + password);
			}
	}

	public void updateRecord() throws SQLException {
	String UPDATE_USERS_SQL = "update student set name = \"Ram\" where id = 3;";

	System.out.println(UPDATE_USERS_SQL);
		// Step 1: Establishing a Connection

				// Step 2:Create a statement using connection object
				Statement statement = connection.createStatement(); 

			// Step 3: Execute the query or update query
			int result = statement.executeUpdate(UPDATE_USERS_SQL);
			System.out.println("Number of records affected :: " + result);
		
		// Step 4: try-with-resource statement will auto close the connection.
	}

	public void deleteRecord() throws SQLException {
		 String DELETE_USERS_SQL = "delete from student where id = 3;";

		System.out.println(DELETE_USERS_SQL);


				// Step 2:Create a statement using connection object
				Statement statement = connection.createStatement() ;

			// Step 3: Execute the query or update query
			int result = statement.executeUpdate(DELETE_USERS_SQL);
			System.out.println("Number of records affected :: " + result);
		
	}
}

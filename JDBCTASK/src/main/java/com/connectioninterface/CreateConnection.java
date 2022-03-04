package com.connectioninterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//example -> Establish Database Connection and Create Table

public class CreateConnection {

	// we first create a connection object using DriverManager.getConnection() API.
	// We will use Connection.createStatement() method to create Statement object:

	private static final String createTableSQL = "create table Users1(\r\n" + "  id  int(3) primary key,\r\n"
			+ "  name varchar(20),\r\n" + "  email varchar(20),\r\n" + "  country varchar(20),\r\n"
			+ "  password varchar(20)\r\n" + "  );";

	public static void main(String[] argv) throws SQLException {
		CreateConnection createTableExample = new CreateConnection();
		createTableExample.createTable();
	}

	public void createTable() throws SQLException {

		System.out.println(createTableSQL);
		// Step 1: Establishing a Connection
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vijay1?useSSL=false",
				"root", "Lufa@7917");

				// Step 2:Create a statement using connection object
				Statement statement = connection.createStatement();) {

			// Step 3: Execute the query or update query
			statement.execute(createTableSQL);
		} catch (SQLException e) {

		}

		// Step 4: try-with-resource statement will auto close the connection.
	}

}

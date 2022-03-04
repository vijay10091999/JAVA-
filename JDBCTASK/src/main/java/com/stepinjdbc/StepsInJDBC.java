package com.stepinjdbc;
import java.sql.*;   //Import packages 

public class StepsInJDBC {
 
	public static void main(String ar[]) {
		try {
			String url = "jdbc:odbc:mydsn";

			// load and register driver ->The forName() method of Class class is used to
			// register the driver class.
			// This method is used to dynamically load the driver class.
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			// connection -> The getConnection() method of DriverManager class is used to
			// establish connection with the database.
			Connection con = DriverManager.getConnection(url);

			// The createStatement() method of Connection interface is used to create
			// statement.
			// The object of statement is responsible to execute queries with the database.
			Statement st = con.createStatement();

			// The executeQuery() method of Statement interface is used to execute queries
			// to the database.
			ResultSet rs = st.executeQuery("select * from login");

			// This method returns the object of ResultSet that can be used to get all the
			// records of a table.
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}

			// By closing connection object statement and ResultSet will be closed automatically.
			// The close() method of Connection interface is used to close the connection.
			con.close();

		} catch (Exception ee) {
			System.out.println("Not Connected");
		}

	}}

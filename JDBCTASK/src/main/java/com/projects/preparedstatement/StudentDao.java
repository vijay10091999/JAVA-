package com.projects.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentDao {
	Connection connection = DBConnection.createcon();

	public int insertRecord(Student st) throws SQLException {
		final String INSERT_USERS_SQL = "INSERT INTO student1" +
		        "  (id, name, email, country, password) VALUES " +
		        " (?, ?, ?, ?, ?);";
		        // Step 1: Establishing a Connection
				// Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
                
                preparedStatement.setInt(1, st.getId());
                preparedStatement.setString(2, st.getName());
                preparedStatement.setString(3, st.getEmail());
                preparedStatement.setString(4, st.getCountry());
                preparedStatement.setString(5, st.getPassword());

                System.out.println(preparedStatement);
                // Step 3: Execute the query or update query
               int result = preparedStatement.executeUpdate();
               return result;

		// Step 4: try-with-resource statement will auto close the connection.
	}

	public void ShowAllRecords() throws SQLException {
		 final String QUERY = "select id,name,email,country,password from student1";

		 
		
				 // Step 2:Create a statement using connection object
	            Statement statement = connection.createStatement();
	            // Step 3: Execute the query or update query
	            ResultSet rs = statement.executeQuery(QUERY);

	            // Step 4: Process the ResultSet object.
	            while (rs.next()) {
	                int id = rs.getInt(1);
	                String name = rs.getString("name");
	                String email = rs.getString("email");
	                String country = rs.getString("country");
	                String password = rs.getString("password");
	                System.out.println(id + "," + name + "," + email + "," + country + "," + password);
	            }
	}

	public int updateRecord(Student st) throws SQLException {
		 final String UPDATE_USERS_SQL = "update student1 set name=?,email=?,country=?,password=? where id = ?";
			PreparedStatement stmt=connection.prepareStatement(UPDATE_USERS_SQL);
			stmt.setString(1, st.getName());
			stmt.setString(2, st.getEmail());
			stmt.setString(3, st.getCountry());
			stmt.setString(4, st.getPassword());
			stmt.setInt(5, st.getId());
    		int result =stmt.executeUpdate();  
     		return result;
		}

	public int deleteRecord(int id) throws SQLException {
	 final String DELETE_USERS_SQL = "delete from student1 where id = ?;";

		System.out.println(DELETE_USERS_SQL);


				// Step 2:Create a statement using connection object
				PreparedStatement stmt=connection.prepareStatement(DELETE_USERS_SQL);
				stmt.setInt(1,id);
	            // Step 3: Execute the query or update query
	            int result = stmt.executeUpdate();
	            System.out.println("Number of records affected :: " + result);
				return result;

	}
}

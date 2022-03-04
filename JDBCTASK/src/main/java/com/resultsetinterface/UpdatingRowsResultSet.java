package com.resultsetinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//The object of ResultSet maintains a cursor pointing to a row of a table. Initially, cursor points to before the first row.
//we can make this object to move forward and backward direction by passing either TYPE_SCROLL_INSENSITIVE or 
//TYPE_SCROLL_SENSITIVE in createStatement(int,int) method 
//as well as we can make this object as updatable by:

//ResultSet Concurrency
//The concurrency of a ResultSet object determines what level of update functionality is supported.
//There are two concurrency levels:
//CONCUR_READ_ONLY: The ResultSet object cannot be updated using the ResultSet interface.
//CONCUR_UPDATABLE: The ResultSet object can be updated using the ResultSet interface.

public class UpdatingRowsResultSet {
public static void main(String[] args) {
	UpdatingRowsResultSet update = new UpdatingRowsResultSet();
	update.modifyUserName();
}
private void modifyUserName() {
    String QUERY = "select id,name,email,country,password from users2 where id = 4";
    try (Connection connection = DriverManager
        .getConnection("jdbc:mysql://localhost:3306/vijay1?useSSL=false",
				"root", "Lufa@7917");
        // Step 2:Create a statement using connection object
        Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
            ResultSet.CONCUR_UPDATABLE);
        // Step 3: Execute the query or update query
        ResultSet rs = stmt.executeQuery(QUERY)) {
        // Step 4: Process the ResultSet object.
        while (rs.next()) {
            String name = rs.getString("name");
            System.out.println("User name before update : " + name);
            rs.updateString("name", "vijay");
            rs.updateRow();
            System.out.println("User name after update  : " + rs.getString("name"));
        }
    } catch (SQLException e) {
 
    }
}
}

package com.metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/* Java DatabaseMetaData interface
DatabaseMetaData interface provides methods to get meta data of a database 
such as database product name, database product version, driver name, 
name of total number of tables, name of total number of views etc.

*
*/

public class DatabaseMetaDataExample {
	public static void main(String[] args) throws SQLException   {
        databaseInfo();
    }

   

	private static void databaseInfo() throws SQLException {
        // Step 1: Establishing a Connection
            Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/vijay1?useSSL=false", "root", "Lufa@7917");
            DatabaseMetaData dbmd = connection.getMetaData();
            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            System.out.println("UserName: " + dbmd.getUserName());
            System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());

    }
}


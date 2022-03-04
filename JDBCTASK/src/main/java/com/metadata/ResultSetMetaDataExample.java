package com.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/* Java ResultSetMetaData Interface
The metadata means data about data i.e. we can get further information from the data.

ResultSetMetaData object that can be used to get information about the types and properties of the columns in a ResultSet object.

If you have to get metadata of a table like total number of column, column name, column type etc. ,
ResultSetMetaData interface is useful because it provides methods to get metadata from the ResultSet object.*/

public class ResultSetMetaDataExample {

    public static void main(String[] args) throws SQLException {

    	final String QUERY = "select id,name,email,country,password from student";

        // Step 1: Establishing a Connection
           Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/vijay1?useSSL=false", "root", "Lufa@7917");

            // Step 2:Create a statement using connection object
            Statement stmt = connection.createStatement();

            // Step 3: Execute the query or update query
            ResultSet rs = stmt.executeQuery(QUERY);

            ResultSetMetaData resultSetMetaData = rs.getMetaData();

            System.out.println("1. Column count in student table :: " + resultSetMetaData.getColumnCount());
            System.out.println("2. First column name in student table :: " + resultSetMetaData.getColumnName(1));
            System.out.println("3. Database name of student table' column id :: " + resultSetMetaData.getCatalogName(1));;
            System.out.println("4. Data type of column id :: " + resultSetMetaData.getColumnTypeName(1));
            System.out.println("5. Get table name of column id :: " + resultSetMetaData.getTableName(1));

    }
}

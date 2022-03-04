package com.newgen.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.newgen.connection.DbCon;
import com.opencsv.CSVWriter;

public class DbToCsv {
	public static boolean dbtocsv() throws SQLException, IOException {
		
		// Connection objects
		Connection con = DbCon.createConn();
		Statement stmt = con.createStatement();
		
	    //Query to retrieve records
		ResultSet rs =stmt.executeQuery("select * from tbl");
		
		//Instantiating the CSVWriter class
		CSVWriter writer = new CSVWriter(new FileWriter("C://Users/Sonali/Desktop/Ajay/output.csv"));
		ResultSetMetaData Mdata = rs.getMetaData();
		
		//Writing data to a csv file
		String line1[] = {Mdata.getColumnName(1), Mdata.getColumnName(2)};
		      writer.writeNext(line1);
		      String data[] = new String[2];
		      while(rs.next()) {
		         data[0] = String.valueOf(rs.getInt("id"));
		         data[1] = rs.getString("title");
		         writer.writeNext(data);
		      }
		      
		//Flushing data from writer to file
		writer.flush();
		return true;
	}
}

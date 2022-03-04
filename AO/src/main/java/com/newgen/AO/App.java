package com.newgen.AO;

import java.io.IOException;
import java.sql.SQLException;

import com.newgen.dao.DbToCsv;

public class App {
	public static void main( String[] args ) throws SQLException, IOException
    {
		boolean res = DbToCsv.dbtocsv();
		if(res) {
			System.out.println("File is saved");
        }
}
}

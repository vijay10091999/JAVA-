package com.drivermanager;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class RegisterDriver {

	//public static synchronized void registerDriver(Driver driver): ->
	//is used to register the given driver with DriverManager.
	//No action is performed by the method when the given driver is already registered.
	
		 public static void main(String[] args) throws SQLException {
		      Driver driver = new com.mysql.cj.jdbc.Driver();
		      DriverManager.registerDriver(driver);
		      System.out.println("Driver sucscessfully registered!");
		  }
		}



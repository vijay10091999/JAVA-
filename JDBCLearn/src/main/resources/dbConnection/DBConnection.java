package com.dbConnection;
import java.sql.*; 

public class DBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		try{  
			
		Class.forName("com.mysql.jdbc.Driver");  
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vijay","root","Lufa@7917");  
		//here vijay is database name, root is username and password is your password
		
		Statement stmt=con.createStatement();  
		
		ResultSet rs=stmt.executeQuery("select * from Employees"); 
		
		while(rs.next()) {
			
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		}
		
		con.close();  
		
		}catch(Exception e){ System.out.println(e);}  
		System.out.println("Not Connected");
	}

}

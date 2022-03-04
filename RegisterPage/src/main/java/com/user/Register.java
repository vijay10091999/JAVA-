package com.user;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;



@MultipartConfig
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       response.setContentType("text/html;charset=UTF-8");
	       try(PrintWriter out = response.getWriter()){
	    	   
	    	   
	    	   
	    	 //getting all the incoming detail from the request...
	    	   
	    	   String name = request.getParameter("user_name");
	    	   String email = request.getParameter("user_email");
	    	   String password=request.getParameter("user_password");
	    	   Part part = request.getPart("image");
	    	   String filename = part.getSubmittedFileName();
	    	  // out.println(filename);
	    	   
	    	   
	  
	    	   
	    	   //connection.............
	    	   try {
	    		   
	    	   
	    		   Thread.sleep(3000);
	    	   Class.forName("com.mysql.jdbc.Driver");
	    	   
	    	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Register","root","Lufa@7917");
	    	   
	    	   //Query.....
	    	   
	    	   String q = "insert into user(name,password,email, image_name) values(?,?,?,?)";
	    	   
	    	   PreparedStatement pstmt = con.prepareStatement(q);
	    	   
	    	   pstmt.setString(1, name);
	    	   pstmt.setString(2, password);
	    	   pstmt.setString(3, email);
	    	   pstmt.setString(4, filename);
	    	   
	    	   pstmt.executeUpdate();
	    	   
	    	   //upload...
	    	   
	    	   InputStream is = part.getInputStream();
	    	   byte [] data = new byte[is.available()];
	    	   
	    	   is.read(data);
	    	   
	    	   String path = request.getRealPath("/")+"img"+File.separator+filename;
	    	   //out.print(path);
	    	  
	    	   
	    	   FileOutputStream fos = new FileOutputStream(path);
	    	   
	    	   fos.write(data);
	    	   fos.close();
	    	   
	    	   out.println("Done");
	    	   
	    	   }
	    	   catch(Exception e) {
	    		   e.printStackTrace();
	    		   out.println("Error");
	    	   }
	
	    	   
	       }
	    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}



}




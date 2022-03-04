package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
	       try(PrintWriter out = response.getWriter()){
	    	   

	    	   out.println("<!DOCTYPE html>");
	    	   out.println("<html>");
	    	   out.println("<head>");
	    	   out.println("<title>Servlet s1</title>");
	    	   out.println("</head>");
	    	   out.println("<body>");
	    	   
	    	 System.out.println("process exceuted......");
	    	  out.println("<h1>Hello,Welcome to my website----</h1>");

	    	   out.println("</body>");
	    	   out.println("</html>");

	}
	 catch(Exception e) {
		 //
	 }
	}
}

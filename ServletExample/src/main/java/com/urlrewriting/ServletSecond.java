package com.urlrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSecond
 */
public class ServletSecond extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       response.setContentType("text/html;charset=UTF-8");
	       try(PrintWriter out = response.getWriter()){
	    	   
	    	   
	    	   out.println("<!DOCTYPE html>");
	    	   out.println("<html>");
	    	   out.println("<head>");
	    	   out.println("<title>Servlet s1</title>");
	    	   out.println("</head>");
	    	   out.println("<body>");
	    	   
	    	   //url:fetch..
	    	   out.println("<h1 style='color:red;'> Welcome to Servlet 2</h1>");
	    	    //for url rewriting......
	    	    // String name = request.getParameter("user");
	    	   
		    	 //for hidden Form field...fetching value from textbox..
			     String name = request.getParameter("name");
	    	   
	    	   out.println("<h1 style='color:Bule;'> Welcome back "+name+"</h1>");

	    	  out.println("</body>");
	    	  out.println("</html>");
	    	  

	    	   
	       }
	    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}



}
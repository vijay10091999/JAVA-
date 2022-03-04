package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
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
	    	   
	    

	    	   
	    	   //getting all the cookies 
	    	   Cookie[] cookies = request.getCookies();
	    	   boolean f = false;
	    	   String name = "";
	    	   if(cookies==null) {
	    		 out.println("<h1>You are new user to go home page and submit your name...</h1>");
	    		 return;
	    	   }else {
	    		   for(Cookie c : cookies) {
	    			  String tname= c.getName();
	    			  if(tname.equals("user_name")) {
	    				  
	    				  f=true;
	    				  name=c.getValue();
	    			  }
	    				  }
	    	   }
	    	   
	    	   if(f) {
	    	   
	    	   out.println("<h1>Hello, " +name+ " Welcome to my website----</h1>");
	    	   out.println("<h1>Thank You</h1>");

	    	   }else {
		    		 out.println("<h1>You are new user to go home page and submit your name...</h1>");

	    	   }
	    	  out.println("</body>");
	    	  out.println("</html>");
	    	  

	    	   
	       }
	    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}



}

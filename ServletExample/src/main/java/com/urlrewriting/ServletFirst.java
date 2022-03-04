package com.urlrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletFirst
 */
public class ServletFirst extends HttpServlet {
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
	    	   
	    	   String name = request.getParameter("name");
	    	   out.println("<h1> Your Name is : "+name+"</h1>");
	    	   
	    	   //for url rewriting........
	    	   //out.println("<a href='ServletSecond?user= " +name+ "'> Go to Second Servlet</a>");
	    	   
	    	   //for hidden Form field value which is present in text field.........
	    	   /*if you are replace input type hidden by text then you can see in the text box there is value present which name we give earlier in textbox
	    	     if we want to hide that textbox then only we can use hidden it automatically fetch that value without showing textbox */
	    	   out.println(""
	    			   +"<form action = 'ServletSecond'>"
	    			   +"<input type='hidden' name= 'name' value='"+name+"'/>"
	    			   +"<button>Go To Second Servlet</button>"
	    			   
	    			   );
	    	  out.println("</body>");
	    	  out.println("</html>");
	    	     
	       }
	    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}



}
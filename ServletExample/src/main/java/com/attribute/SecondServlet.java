package com.attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       response.setContentType("text/html;charset=UTF-8");
	       try(PrintWriter out = response.getWriter()){
	    	   
	    	   
	    	   out.println("<!DOCTYPE html>");
	    	   out.println("<html>");
	    	   out.println("<head>");
	    	   out.println("<title>Servlet s1</title>");
	    	   out.println("</head>");
	    	   out.println("<body>");
	    	   
	    	   String n1 = request.getParameter("num1");
	    	   String n2 = request.getParameter("num2");
	    	   
	    	   int nn1 = Integer.parseInt(n1);
	    	   int nn2 = Integer.parseInt(n2);
	    	   
	    	   //add
	    	   int p = nn1*nn2;
	    	   
	    	   //attribute
	    	   
	    	  int sum = (int)request.getAttribute("sum");
	    	   
	    	  out.println("sum is ="+sum);
	    	  out.println("product is ="+p);

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

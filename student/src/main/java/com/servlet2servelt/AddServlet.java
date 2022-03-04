package com.servlet2servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {
	

		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			
			int k = i + j;
		  
		  // RequestDispatcher Calling a Servlet from servlet
			
			res.sendRedirect("sq?key="+k);
			
			
			
			/* Method 1: by using forward() 
			req.setAttribute("key",k);
		    RequestDispatcher rd = req.getRequestDispatcher("sq");
			rd.forward(req, res); */
			
		}
		
}


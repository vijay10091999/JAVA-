package com.startwithjsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	@WebServlet("/DemoServlet")
	public class DemoServlet extends HttpServlet {
		

			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
				
			String name = "vijay";
			
			request.setAttribute("label",name);
			RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
			rd.forward(request,response);
			
				
			}
			
	}


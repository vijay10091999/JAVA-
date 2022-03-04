package com.ServletConfig_ServletContext;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class MyServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
		
		PrintWriter out = res.getWriter();
		out.print("Hi<br>");
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.println(str);
		
		
	}
}

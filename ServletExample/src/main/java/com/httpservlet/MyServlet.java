package com.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		System.out.println("this is my project...");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>this is my servlets</h1>");
		//out.println(new Date().toString());
	}
}
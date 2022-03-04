package com.servlet2servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
		
		int k = Integer.parseInt(req.getParameter("key"));
		
		k= k* k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is :"+k);
		
		System.out.println("sql server");
	}
}


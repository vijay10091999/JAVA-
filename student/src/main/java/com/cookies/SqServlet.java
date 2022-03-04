package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
	
		int k = 0;	
    javax.servlet.http.Cookie[] cookies = req.getCookies();
    for(javax.servlet.http.Cookie c : cookies) {
    	if(c.getName().equals("key"))
    		k = Integer.parseInt(c.getValue());
    }
		   
		System.out.println("square.....");	
	
		
		k= k* k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is :"+k);
		
		
	}
}
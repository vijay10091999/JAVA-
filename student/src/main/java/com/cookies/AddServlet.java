package com.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cal")
public class AddServlet extends HttpServlet {
	

		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			
			int k = i + j;
	
		Cookie cookie = new Cookie("key",k+ "");
		res.addCookie(cookie);
			
		    res.sendRedirect("sq");
		}
		
}


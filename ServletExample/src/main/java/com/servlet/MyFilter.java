package com.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class MyFilter implements Filter {

	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
        System.out.println("before filter");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("after servlet");
	}

	
	public void destroy() {
			
		}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}

package com.loginproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthFilter implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String password = request.getParameter("password");
		
		if(password.equals("1234")){
			
			chain.doFilter(request, response);
		}
		else {
			
			writer.print("<h1> username or password is incorrect </h1>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			
		}
	
		
		
	}
	
	@Override
	public void destroy() {
		
		
		
	}

}

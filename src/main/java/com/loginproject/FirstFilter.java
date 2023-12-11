package com.loginproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstFilter implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		PrintWriter writer = response.getWriter();
		
		writer.print("filter is invoked before");
		
		chain.doFilter(request, response);
		
		writer.print("filter is invoked after");
		
	}
	
	@Override
	public void destroy() {
		
		
	}

}

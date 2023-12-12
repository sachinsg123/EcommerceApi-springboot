package com.loginproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletFirst extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		writer.print("<h1> servlet first is working </h1>");
		String name = req.getParameter("username");
		
		writer.print("Welcome  : "+name);
		writer.print("Your password is secured");
		
	}

}

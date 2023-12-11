package com.loginproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		
		
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(password.equals("12345")) {
			
			writer.print("Welcome "+name);
			HttpSession session = req.getSession();
			session.setAttribute("user", name);
			
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
			
		}
		else {
			
			writer.print("Username or password is incorrect");
			RequestDispatcher r = req.getRequestDispatcher("login.html");
		    r.include(req, resp);
			
		}
		
		
		
	}

}

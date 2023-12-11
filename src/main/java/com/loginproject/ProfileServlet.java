package com.loginproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.WriteAbortedException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		PrintWriter writer = resp.getWriter();
		
		if(session!=null) {
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
			String name = (String) session.getAttribute("user");
			writer.print("Welcome to profile "+name);
		}
		else {
			
			writer.print("please login");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
			
		}
	}

}

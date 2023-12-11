package com.loginproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("logout succefully");
		RequestDispatcher rd = req.getRequestDispatcher("login.html");
		rd.include(req, resp);
		
		HttpSession session = req.getSession();
		session.invalidate();
		
		
	}

}

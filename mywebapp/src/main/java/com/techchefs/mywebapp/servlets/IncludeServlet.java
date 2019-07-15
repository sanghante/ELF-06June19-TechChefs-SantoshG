package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = null;
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		out.println("11111111111111111111111111111111111111111");
		out.println("<br>");
		out.println("<br>");
		
		dispatcher = req.getRequestDispatcher("index.html");
		dispatcher.include(req, resp);		
		out.println("<br>");
		
		out.println("22222222222222222222222222222222222222222");
		
		dispatcher = req.getRequestDispatcher("currentDateTime?fname=Santosh&lname=Y");
		dispatcher.include(req, resp);
		out.println("<br>");
		
		out.println("33333333333333333333333333333333333333333");
		dispatcher = req.getRequestDispatcher("empSearch?eid=30");
		dispatcher.include(req, resp);		
		out.println("<br>");
		
		
		out.println("444444444444444444444444444444444444444444");
		
	}//End of doGet()

}//End of Class

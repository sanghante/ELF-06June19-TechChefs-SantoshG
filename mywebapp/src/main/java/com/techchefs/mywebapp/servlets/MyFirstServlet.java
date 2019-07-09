package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyFirstServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String currentDateTime = new Date().toString();
		
		String htmlResponse = 
				"<!DOCTYPE html>"+
						"<html>"+
						"<head>"+
						"<meta charset=\"ISO-8859-1\">"+
						"<title>Insert title here</title>"+
						"</head>"+
						"<body>"+
						"	<h1>"+
						"		Current time is : <br>"+
						"		<span style=\"color:blue\">"+currentDateTime+"</span>"+
						"	</h1>"+
						"</body>"+
						"</html>";
		
		//send resp to browser
		resp.setContentType("text/html");
		resp.setHeader("Refresh","1"); //Auto Refresh every second
		PrintWriter out = resp.getWriter();
		out.print(htmlResponse);
	}
	
}

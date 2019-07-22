package com.techchefs.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.extern.java.Log;

@WebServlet("/loginpage")
public class LoginPageServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie dummyCookie = new Cookie("dummyCookie", "CheckCookiesEnabled");
		resp.addCookie(dummyCookie);
		
		//PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		RequestDispatcher dispatcher = null;
		
		HttpSession session = req.getSession(false);
		if (session == null) {
			
			dispatcher = req.getRequestDispatcher("./login.html");
			dispatcher.include(req, resp);
			
		} else {
			
			dispatcher = req.getRequestDispatcher("./display");
			dispatcher.forward(req, resp);		
		}
	}

}

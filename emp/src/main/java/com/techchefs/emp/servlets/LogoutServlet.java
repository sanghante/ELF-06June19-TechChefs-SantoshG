package com.techchefs.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeDAOFactory;
import com.techchefs.emp.dto.EmployeeInfoBean;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//Invalidate the session
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		if (session != null) {			
			session.invalidate();
		}
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"ISO-8859-1\">");
		out.print("<title>Search Result</title>");
		out.print("</head>");
		out.print("<body>");
		out.println("<h6><span style='color:green'> Successfully logged out!!!</span></h6>");
		out.print("</body>");
		out.print("</html>");
		RequestDispatcher dispatcher = req.getRequestDispatcher("./login.html");
		dispatcher.include(req, resp);

	}

}

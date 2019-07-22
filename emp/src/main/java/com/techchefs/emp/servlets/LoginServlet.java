package com.techchefs.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Dispatch;

import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeDAOFactory;
import com.techchefs.emp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(req.getCookies() == null) {
			req.getRequestDispatcher("./cookiesdisabled.html").include(req, resp);
			return;
		}

		String idValue = req.getParameter("empid");
		String pwdValue = req.getParameter("pwd");

		EmployeeInfoBean bean = verifyEmployee(idValue, pwdValue);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		RequestDispatcher dispatcher = null;

		if (bean == null) {

			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<meta charset=\"ISO-8859-1\">");
			out.print("<title>My Servlet Response</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<h6 class=\"text-center\">");
			out.print("<span style=\"color:red\">");
			out.print("Employee ID or Password incorrect");
			out.print("</span>");
			out.print("</h6>");
			out.print("</body>");
			out.print("</html>");


		} else {

			HttpSession session = req.getSession(true);
			session.setAttribute("userData", bean);
			Cookie cookie = new Cookie("JSESSIONID", session.getId());
			cookie.setMaxAge(7*24*60*60);
			resp.addCookie(cookie);			
			
			dispatcher = req.getRequestDispatcher("./display");
			dispatcher.forward(req, resp);
		
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}

	private EmployeeInfoBean verifyEmployee(String id, String pwd) {

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);

		if (bean != null && pwd.equals(bean.getPassword())) {
			log.info("Password OK, login successful");
			return bean;
		} else {
			return null;
		}

	}

}

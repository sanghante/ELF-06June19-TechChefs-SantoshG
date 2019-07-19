package com.techchfs.emp.servlets;

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

import com.techchefs.designpatterns.dao.EmployeeDAO;
import com.techchefs.designpatterns.dao.EmployeeDAOFactory;
import com.techchefs.mywebapp.dto.EmployeeInfoBean;

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
		
		out.println("<h1><span style='color:green'> Successfully logged out!!!</span></h1>");
		RequestDispatcher dispatcher = req.getRequestDispatcher("./login.html");
		dispatcher.include(req, resp);

	}

	private ArrayList<EmployeeInfoBean> searchLikeEmployee(String id) {

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		ArrayList<EmployeeInfoBean> beans = dao.getAllEmployeeInfo(id);

		return beans;
	}

}

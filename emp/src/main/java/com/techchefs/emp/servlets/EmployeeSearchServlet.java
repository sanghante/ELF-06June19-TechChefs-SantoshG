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

@WebServlet("/empSearch")
public class EmployeeSearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		HttpSession session = req.getSession(false);
		if (session == null) {
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<meta charset=\"ISO-8859-1\">");
			out.print("<title>Search Result</title>");
			out.print("</head>");
			out.print("<body>");
			out.println("<h6><span style='color:red'> Invalid Session!! Please login!!!</span></h6>");
			out.print("</body>");
			out.print("</html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("./login.html");
			dispatcher.include(req, resp);

		} else {

			String idValue = req.getParameter("eid");
			ArrayList<EmployeeInfoBean> beans = searchLikeEmployee(idValue);
			resp.setContentType("text/html");

			if (beans == null || beans.size() == 0) {
				out.print("<!DOCTYPE html>");
				out.print("<html>");
				out.print("<head>");
				out.print("<meta charset=\"ISO-8859-1\">");
				out.print("<title>Search Result</title>");
				out.print("</head>");
				out.print("<body>");
				out.print("<h1>");
				out.print("<span style=\"color:red\">");
				out.print("No matching employee found");
				out.println("<div class='col-md-1'>");
				out.println("<a href='./logout'>Logout</a>");
				out.println("</div>");				
				out.print("</span>");
				out.print("</h1>");
				out.print("</body>");
				out.print("</html>");

			} else {
				out.print("<!DOCTYPE html>");
				out.print("<html>");
				out.print("<head>");
				out.print("<meta charset=\"ISO-8859-1\">");
				out.print("<title>Search Result</title>");
				out.print("</head>");
				out.print("<body>");
				out.println("<div class='col-md-1'>");
				out.println("<a href='./logout'>Logout</a>");
				out.println("</div>");	
				out.println("<div class='col-md-4'>");
				out.println("<a href='./display'><img src='image_avatar.png' alt='Avatar' style='width:100px;'></a>");
				out.println("</div>");
				out.print("<h1>");
				out.print("<span style=\"color:green\">");
				out.print("Employee(s) Found");
				out.print("</span>");
				out.print("<br><br>");
				out.print("</h1>");
				out.println("Employee(s) Found");
				for (EmployeeInfoBean employeeInfoBean : beans) {
					out.print("<br><a href='./display?eid=" + employeeInfoBean.getId() + "'" + "/> ID : "
							+ employeeInfoBean.getId());
					out.print("Name : " + employeeInfoBean.getName());
				}
				out.print("</body>");
				out.print("</html>");

			}
		}

	}

	private ArrayList<EmployeeInfoBean> searchLikeEmployee(String id) {

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		ArrayList<EmployeeInfoBean> beans = dao.getAllEmployeeInfo(id);

		return beans;
	}

}

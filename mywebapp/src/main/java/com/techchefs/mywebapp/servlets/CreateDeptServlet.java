package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.designpatterns.dao.EmployeeDAO;
import com.techchefs.designpatterns.dao.EmployeeDAOFactory;
import com.techchefs.mywebapp.dto.EmployeeDepartmentInfoBean;

@WebServlet("/saveDept")
public class CreateDeptServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		EmployeeDepartmentInfoBean bean = new EmployeeDepartmentInfoBean();
		bean.setDeptId(Integer.parseInt(req.getParameter("dept_id")));
		bean.setDeptName(req.getParameter("dept_name"));

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		
		if (dao.createDeptInfo(bean)) {
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<meta charset=\"ISO-8859-1\">");
			out.print("<title>Dept Servlet Response</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<h1>");
			out.print("<span style=\"color:green\">");
			out.print("Department successfully saved in DB");
			out.print("</span>");
			out.print("</h1>");
			out.print("</body>");
			out.print("</html>");
		} else {
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<meta charset=\"ISO-8859-1\">");
			out.print("<title>Dept Servlet Response</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<h1>");
			out.print("<span style=\"color:red\">");
			out.print("Department could not be saved into the DB");
			out.print("</span>");
			out.print("</h1>");
			out.print("</body>");
			out.print("</html>");
	
		}


	}

	private boolean saveNewEmployee() {

		return true;

	}
}

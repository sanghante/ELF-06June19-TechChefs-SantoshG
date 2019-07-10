package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.designpatterns.dao.EmployeeDAO;
import com.techchefs.designpatterns.dao.EmployeeDAOFactory;
import com.techchefs.designpatterns.dto.EmployeeInfoBean;

public class EmployeeSearchServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String idValue = req.getParameter("eid");
		EmployeeInfoBean bean = searchEmployee(idValue);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		if (bean == null) {
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<meta charset=\"ISO-8859-1\">");
			out.print("<title>My Servlet Response</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<h1>");
			out.print("<span style=\"color:red\">");
			out.print("Employee not found");
			out.print("</span>");
			out.print("</h1>");
			out.print("</body>");
			out.print("</html>");
			
		} else {
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<meta charset=\"ISO-8859-1\">");
			out.print("<title>My Servlet Response</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<h1>");
			out.print("<span style=\"color:green\">");
			out.print("Employee Found");
			out.print("</span>");
			out.print("<br><br>");
			out.print("</h1>");
			out.print("Employee Found");
			out.print("<br>Designation : "+bean.getDesignation());
			out.print("<br>ID : "+bean.getId());
			out.print("<br>Name : "+bean.getName());
			out.print("<br>Age : "+bean.getAge());
			out.print("<br>Manager ID : "+bean.getManagerId());
			out.print("<br>Department ID : "+bean.getDepartmentId());
			out.print("<br>Salary : "+bean.getSalary());
			out.print("<br>DOB : "+bean.getDob());
			out.print("<br>Email : "+bean.getEmail());
			out.print("<br>Gender : "+bean.getGender());
			out.print("<br>Joining date : "+bean.getJoiningDate());
			out.print("<br>Account number : "+bean.getAccountNumber());
			out.print("<br>Phone number : "+bean.getPhoneNumber());

			out.print("</body>");
			out.print("</html>");
			
		}
 		

	
	}
	
	private EmployeeInfoBean searchEmployee(String id) {
		
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		
		return bean;
	}

}

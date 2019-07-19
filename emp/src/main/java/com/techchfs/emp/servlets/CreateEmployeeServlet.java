package com.techchfs.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.designpatterns.dao.EmployeeDAO;
import com.techchefs.designpatterns.dao.EmployeeDAOFactory;
import com.techchefs.mywebapp.dto.EmployeeInfoBean;

@WebServlet(urlPatterns = "/create" , 
			initParams = { 
							@WebInitParam(name = "actress", value = "Gyweneth Paltrow")
			}
)
public class CreateEmployeeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String idValue = req.getParameter("eid");

		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();

		employeeInfoBean.setId(Integer.parseInt(req.getParameter("eid")));
		employeeInfoBean.setDepartmentId(Integer.parseInt(req.getParameter("edeptid")));
		employeeInfoBean.setManagerId(Integer.parseInt(req.getParameter("emanagerid")));
		employeeInfoBean.setAccountNumber(Long.parseLong(req.getParameter("eaccount")));
		employeeInfoBean.setDesignation(req.getParameter("edesignation"));
		employeeInfoBean.setEmail(req.getParameter("email"));
		employeeInfoBean.setGender(req.getParameter("egender"));
		try {
			employeeInfoBean.setJoiningDate(formatter.parse(req.getParameter("jdate")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		employeeInfoBean.setName(req.getParameter("ename"));
		employeeInfoBean.setPhoneNumber(req.getParameter("ephone"));
		employeeInfoBean.setSalary(Double.parseDouble(req.getParameter("esalary")));
		try {
			employeeInfoBean.setDob(formatter.parse(req.getParameter("edob")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		employeeInfoBean.setAge(Integer.parseInt(req.getParameter("eage")));
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		if (dao.createEmployeeInfo(employeeInfoBean)) {
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<meta charset=\"ISO-8859-1\">");
			out.print("<title>My Servlet Response</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<h1>");
			out.print("<span style=\"color:green\">");
			out.print("Employee successfully saved in DB");
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
			out.print("<span style=\"color:red\">");
			out.print("Employee could not be saved into the DB");
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

package com.techchefs.emp.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeDAOFactory;
import com.techchefs.emp.dto.EmployeeInfoBean;
import com.techchefs.emp.dto.UserBean;

import lombok.extern.java.Log;
@Log
@Controller
@RequestMapping("/session")
public class SessionController {
	

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap modelMap) {
		session.invalidate();
		modelMap.addAttribute("msg", "Logout Successful");
		return "login";
	}

	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}
	
	@PostMapping("/login")
	public String doLoginAuth(UserBean userBean, HttpServletRequest req) {
		EmployeeInfoBean empBean = authenticateEmployee(userBean);
		
		if (empBean != null) {
			req.getSession(true);
			req.setAttribute("empBean", empBean);
			return "displaypage";
		} else {
			req.setAttribute("msg", "Incorrect Credentials");
			return "login";
		}
	}
	
	private EmployeeInfoBean authenticateEmployee(UserBean userBean) {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(userBean.getUserId());

		if (bean != null && userBean.getPassword().equals(bean.getPassword())) {
			log.info("Password OK, login successful");
			return bean;
		} else {
			return null;
		}
	}
	
	@GetMapping("/validate")
	private String validateSession(HttpSession session, ModelMap modelMap, @RequestParam String url) {
		if(session.isNew()) {
			modelMap.addAttribute("msg", "Please login first!");
			session.invalidate();
			return "login";
		}
		return url;
	}
	

	@GetMapping("/validate1")
	private String validateSession1(HttpServletRequest req, ModelMap modelMap, @RequestParam String url) {
		if(req.getSession(false) == null) {
			modelMap.addAttribute("msg", "Please login first!");			
			return "login";
		}
		return url;
	}
	
	
	@PostMapping("/validate")
	private String validateSession4Post(HttpSession session, ModelMap modelMap, @RequestParam String url) {
		if(session.isNew()) {
			modelMap.addAttribute("msg", "Please login first!");
			session.invalidate();
			return "login";
		}
		return url;
	}
	
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(ModelMap modelMap, EmployeeInfoBean empBean) {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		if (dao.createEmployeeInfo(empBean)) {
			modelMap.addAttribute("empBean", empBean);
			return "displaypage";

		} else {
			modelMap.addAttribute("msg", "Unable to save DB, try again later");
			return "createEmployee";
		}
	}
	
	@GetMapping("/createEmployee")
	public String createEmployee() {
		return "createEmployee";
	}
	
	@PostMapping("/empSearch")
	public String searchEmployees(String userId, ModelMap modelMap) {
		ArrayList<EmployeeInfoBean> beans = getAllEmployees(userId);
		modelMap.addAttribute("beanList", beans);
		return "searchresult";
	}

	
	private ArrayList<EmployeeInfoBean> getAllEmployees(String id) {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		ArrayList<EmployeeInfoBean> beans = dao.getAllEmployeeInfo(id);
		return beans;
	}
	
}//End of controller

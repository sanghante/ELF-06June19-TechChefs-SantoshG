package com.techchefs.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeDAOFactoryold;
//import com.techchefs.emp.dto.EmployeeInfoBean;
import com.techchefs.emp.onetoone.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
//@Controller
//@RequestMapping("/employee123")
public class EmployeeControllerold {
	
	@InitBinder
	public void customBinder(WebDataBinder binder) {
		CustomDateEditor customDateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, customDateEditor);
	}
	
	@RequestMapping(path="/getMessage", method = RequestMethod.GET)
	public ModelAndView getMessage() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("messagePage");
		return modelAndView;
	}

	@GetMapping(value = "/seeMessage")
	public ModelAndView getMessage(ModelAndView modelAndView) {
		modelAndView.setViewName("messagePage");
		return modelAndView;
		
	}
	
	
	@PostMapping("/doAuth")
	public String doLoginAuth(int userId, String password, ModelMap modelMap ) {
		
		EmployeeInfoBean empBean = authenticateEmployee(userId, password);
		
		if (empBean != null) {
			modelMap.addAttribute("empBean", empBean);
			return "displaypage";
		}else {
			modelMap.addAttribute("msg", "Incorrect Credentials");
			return "login";
		}
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(ModelMap modelMap, EmployeeInfoBean empBean) {
		EmployeeDAO dao = EmployeeDAOFactoryold.getInstance();
		if (dao.createEmployeeInfo(empBean)) {
			modelMap.addAttribute("empBean", empBean);
			return "displaypage";

		} else {
			modelMap.addAttribute("msg", "Incorrect Credentials");
			return "login";
		}
		
	}
	
	@GetMapping("/createEmployee")
	public String createEmployee() {
		return "createEmployee";
	}
	
	
	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}

	private EmployeeInfoBean authenticateEmployee(int id, String pwd) {

		EmployeeDAO dao = EmployeeDAOFactoryold.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);

		if (bean != null && pwd.equals(bean.getPassword())) {
			log.info("Password OK, login successful");
			return bean;
		} else {
			return null;
		}
	}
	
	
}

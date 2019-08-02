package com.techchefs.emp.controller;

import static com.techchefs.emp.commons.EMPConstants.*;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDAO empDao;
	
	@GetMapping("/search")
	public String employeeSearch(String userId, HttpServletRequest req) {
		
		ArrayList<EmployeeInfoBean> beans = empDao.getAllEmployeeInfo(userId);		
		req.setAttribute("beanList", beans);
		return VIEW_SEARCH_RESULT_PAGE;
	}

}

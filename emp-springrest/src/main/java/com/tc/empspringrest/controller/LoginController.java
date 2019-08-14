package com.tc.empspringrest.controller;

import static com.tc.empspringrest.common.EMPConstants.*;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tc.empspringrest.beans.EmployeeInfoBean;
import com.tc.empspringrest.beans.EmployeeResponse;
import com.tc.empspringrest.dao.EmployeeDao;

@RestController
@RequestMapping("/login")
@PropertySource(PROPERTY_FILENAME)
public class LoginController {

	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDao dao;

	@PostMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id, String password, HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		if (bean != null && bean.getPassword().equals(password)) {
			response.setStatusCode(201);
			response.setMessage(SUCCESS);
			response.setDescription("Login was successful");
			response.setBeans(Arrays.asList(bean));
			request.getSession().setAttribute("bean", bean);
		} else {
			response.setStatusCode(401);
			response.setMessage(FAILURE);
			response.setDescription("Invalid Credentials");
		}
		return response;
	}
	
	@GetMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse logout(HttpSession session) {
		session.invalidate();
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage(SUCCESS);
		response.setDescription("Logged out successfully");
		return response;
	}
	
	@GetMapping(value = "/readCookie", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse readCookie(@CookieValue(name="JSESSIONID") String sessionId) {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage(SUCCESS);
		response.setDescription("JsessionId : "+ sessionId);
		return response;
	}
}

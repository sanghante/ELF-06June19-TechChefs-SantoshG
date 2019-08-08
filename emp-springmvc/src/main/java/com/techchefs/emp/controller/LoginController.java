package com.techchefs.emp.controller;

import static com.techchefs.emp.commons.EMPConstants.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techchefs.emp.dao.EmployeeDAO;
//import com.techchefs.emp.dto.EmployeeInfoBean; 
import com.techchefs.emp.onetoone.EmployeeInfoBean;

@Controller
@RequestMapping("/login")
@PropertySource(PROP_FILE_NAME)
public class LoginController {
	
	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDAO empDao;

	@GetMapping("/loginPage")
	public String loginPage() {
		return VIEW_LOGIN_PAGE ;
	}
	
	@PostMapping("/authenticate")
	public String authenticate(String userId, String password, HttpServletRequest req, 
			@Value("${invalid.login.msg}") String failmsg, @Value("${welcome.msg}") String successmsg) {
		
		EmployeeInfoBean empBean = empDao.getEmployeeInfo(userId);
		if(password.equals(empBean.getPassword())) {
			HttpSession session = req.getSession(true);
			session.setAttribute("empBean", empBean);
			req.setAttribute("msg", successmsg+empBean.getName());
			return VIEW_HOME_PAGE;
		} else {
			req.setAttribute("msg", failmsg);
			return VIEW_LOGIN_PAGE;
		}
		
	}
	
	@GetMapping("/logout")
	public String logoutAction(HttpSession session, ModelMap modelMap, @Value("${logout.msg}") String msg) {
		session.invalidate();
		modelMap.addAttribute("msg", msg);
		return VIEW_LOGIN_PAGE;
	}
	
}

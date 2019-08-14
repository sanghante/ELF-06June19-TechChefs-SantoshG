package com.tc.empspringmvc.controller;

import static com.tc.empspringmvc.common.EMPConstants.DB_INTERACTION_TYPE;
import static com.tc.empspringmvc.common.EMPConstants.PROPERTY_FILENAME;
import static com.tc.empspringmvc.common.EMPConstants.VIEW_HOMEPAGE;
import static com.tc.empspringmvc.common.EMPConstants.VIEW_LOGINPAGE;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tc.empspringmvc.beans.EmployeeInfoBean;
import com.tc.empspringmvc.dao.EmployeeDao;

@Controller
@RequestMapping("/login")
@PropertySource(PROPERTY_FILENAME)
public class LoginController {

	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDao dao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping("/loginPage")
	public String loginPage() {
		return VIEW_LOGINPAGE;
	}
	
	@PostMapping("/authenticate")
	public String authenticate(int id, String password, HttpServletRequest req,@Value("${loginFailed}") String msg) {
//		EmployeeDao dao = EmployeeDAOFactory.getInstance(dbInteractionType);  //Without using autowired
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		if (bean != null && bean.getPassword().equals(password)) {
			HttpSession session = req.getSession();
			session.setAttribute("bean", bean);
			return VIEW_HOMEPAGE;
		} else {
			req.setAttribute("msg", msg);
			return VIEW_LOGINPAGE;
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map, @Value("${logoutMsg}") String msg) {
		session.invalidate();
		map.addAttribute("msg", msg);
		return VIEW_LOGINPAGE;
	}
	// 2nd Method to get the request in validate and forwarding to the appropriate
	// url in which query string is taken as a url path
	@GetMapping("/validate/{url}")
	public String validate(HttpSession session, ModelMap map, @Value("${msg}") String msg,
			@PathVariable("url") String url) {
		if (session.isNew()) {
			map.addAttribute("msg", msg);
			session.invalidate();
			return "login";
		}
		return "forward:/webapp/" + url;
	}

	@PostMapping("/validate/{url}")
	public String validatePost(HttpSession session, ModelMap map, @Value("${msg}") String msg,
			@PathVariable("url") String url) {
		return validate(session, map, url, msg);
	}

	@GetMapping("/createEmployeePage")
	public String createEmployee() {
		return "createemployee";
	}

	@GetMapping("/getHomePage")
	public String homePage(HttpSession session, ModelMap map) {
		map.addAttribute("bean", session.getAttribute("bean"));
		return "home";
	}

	@PostMapping("/getHomePage")
	public String homePage2(HttpSession session, ModelMap map) {
		map.addAttribute("bean", session.getAttribute("bean"));
		return "home";
	}

	

	@GetMapping("/getEmployee")
	public String getEmployee(int id, ModelMap map) {
//		EmployeeDao dao = EmployeeDAOFactory.getInstance(dbInteractionType);
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		map.addAttribute("bean", bean);
		return "home";
	}

	@GetMapping("/searchEmployee")
	public String searchEmployee(int q, HttpSession session, ModelMap map) {
//		EmployeeDao dao = EmployeeDAOFactory.getInstance(dbInteractionType);
		List<EmployeeInfoBean> beans = dao.getAllEmployeeInfoWithRestrictions(q + "");
		map.addAttribute("emplist", beans);
		return "searchemployee";
	}

	

	@GetMapping("/createEmployee")
//	public String addEmployee(EmployeeInfoBean bean, ModelMap map,@Value("${dbInteractionType}") String dbInteractionType) {
		public String addEmployee(EmployeeInfoBean bean, ModelMap map) {
//		EmployeeDao dao = EmployeeDAOFactory.getInstance(dbInteractionType);
		boolean result = dao.createEmployeeInfo(bean);
		if (result) {
			map.addAttribute("msg", "Employee added Successfully!!!");
		} else {
			map.addAttribute("msg", "Employee insertion failed!!!");
		}
		return "login";
	}

	// 1st Method to get the request in validate and forwarding to the appropriate
	// url in which query string is shown in browser
//		@GetMapping("/validate")
//		public String validate(HttpSession session,ModelMap map, @RequestParam String url, @Value("${msg}") String msg) {
//			if(session.isNew()) {
//				map.addAttribute("msg",msg);
//				session.invalidate();
//				return "login";
//			}
//			return "forward:/webapp/"+url;
//		}
//		@PostMapping("/validate")
//		public String validatePost(HttpSession session,ModelMap map, @RequestParam String url, @Value("${msg}") String msg) {
//			return validate(session, map, url,msg);
//		}

}

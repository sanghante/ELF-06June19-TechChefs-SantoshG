package com.techchefs.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techchefs.emp.dto.UserBean;

@Controller
@RequestMapping("/forms")
public class FormController {
	
	@GetMapping("/getForm")
	public String getForm() {
		return "myForm";
	}
	
	@PostMapping("/formSubmit")
	public String submitForm(HttpServletRequest req) {
		
		int userId = Integer.parseInt(req.getParameter("userId"));
		String password = req.getParameter("password");
		
		req.setAttribute("userId", userId);
		req.setAttribute("password", password);
		
		return "formDataDisplay";
		
	}//End of submitForm
	
	@PostMapping("/springFormSubmit")
	public String submitFormSpringWay(int userId, String password, ModelMap modelMap) {
		
		modelMap.addAttribute("userId", userId);
		modelMap.addAttribute("password", password);
	
		return "formDataDisplay";
	}//End of submitFormSpringWay
	
	@PostMapping("/springFormSubmitUsingBean")
	public String submitFormSpringWayUsingBean(UserBean userBean, ModelMap map) {
		map.addAttribute("userBean", userBean);
	
		return "formDataDisplayUsingBean";
	}//End of submitFormSpringWayUsingBean
	
	
	@PostMapping("/springFormSubmitUsingReqParam")
	public String submitFormSpringWayUsingReqParam(@RequestParam(name = "userId") int uId, 
			@RequestParam(name = "password") String pwd , ModelMap modeMap) {
		modeMap.addAttribute("userId", uId);
		modeMap.addAttribute("password", pwd);
	
		return "formDataDisplay";
	}//End of submitFormSpringWayUsingBean

	@PostMapping("/springFormSubmitUsingReqParamEL")
	public String submitFormSpringWayUsingReqParamEL(@RequestParam(name = "userId") int uId, 
			@RequestParam(name = "password") String pwd , ModelMap modeMap) {
		modeMap.addAttribute("userId", uId);
		modeMap.addAttribute("password", pwd);
	
		return "formDataDisplayEL";
	}//End of submitFormSpringWayUsingBean
	
	@PostMapping("/springFormSubmitUsingBeanEL")
	public String submitFormSpringWayUsingBeanEL(UserBean userBean, ModelMap map) {
		map.addAttribute("userBean", userBean);
	
		return "formDataDisplayUsingBeanEL";
	}//End of submitFormSpringWayUsingBean
			
		
}//End of class

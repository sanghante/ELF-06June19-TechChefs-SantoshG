package com.techchefs.emp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.techchefs.emp.commons.EMPConstants.*;

@Controller
@RequestMapping("/validator")
public class SessionValidatorController {
	
	@GetMapping("/validate/{url1}/{url2}")
	public String validate(HttpSession session, @Value("${msg}") String msg,
			@PathVariable("url1") String url1, @PathVariable("url2") String url2,
			ModelMap modelMap) {
		if(session.isNew()) {
			modelMap.addAttribute("msg", msg);
			session.invalidate();
			return VIEW_LOGIN_PAGE ;
		}
		return "forward:/"+url1+"/"+url2;
	}
	
	@PostMapping("/validate/{url1}/{url2}")
	public String validate4Post(HttpSession session, @Value("${msg}") String msg, 
			@PathVariable("url1") String url1, @PathVariable("url2") String url2,
			ModelMap modelMap) {
		return validate(session, msg, url1, url2, modelMap);
	}

}

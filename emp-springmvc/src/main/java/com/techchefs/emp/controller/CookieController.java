package com.techchefs.emp.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookie")
public class CookieController {

	@GetMapping("/getCookiePage")
	public String addCookie() {
		return "createCookie";
	}
	
	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse resp, ModelMap modelMap) {
		Cookie cookie = new Cookie("name", "myCookie");
		resp.addCookie(cookie);
		modelMap.addAttribute("msg", "myCookie added to the response");
		return "createCookie";
	}
	
	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name="name") String myCookieValue, ModelMap modelMap) {
		modelMap.addAttribute("msg", myCookieValue);
		return "createCookie";
	}
	

}//End of controller

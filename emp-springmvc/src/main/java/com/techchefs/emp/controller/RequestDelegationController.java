package com.techchefs.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/delegate")
public class RequestDelegationController {

	@GetMapping("/getHomePage")
	public String getHomePage() {
		return "homePage";		
	}
	
	@GetMapping("/forwardReq")
	public String forwardReq() {
		return "forward:/forms/getForm";
	}
	
	@GetMapping("/redirectReq")
	public String redirectReq() {
		return "redirect:https://www.google.com";
	}
	
}//End of controller

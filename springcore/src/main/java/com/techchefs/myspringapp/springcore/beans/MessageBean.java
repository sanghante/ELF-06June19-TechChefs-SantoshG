package com.techchefs.myspringapp.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MessageBean {
	
	private String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String str) {
		this.message = str;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init");
	}
	
	@PreDestroy
	public boolean destroy() {
		System.out.println("Destroy");
		return false;
	}

}

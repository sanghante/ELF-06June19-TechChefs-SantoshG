package com.techchefs.myspringapp.springcore.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.techchefs.myspringapp.springcore.beans.MessageBean;

@Configuration
public class MessageConfig {
	
	@Bean 
	@Scope(scopeName = "prototype")
	public MessageBean getMessageBean() {
		MessageBean mBean = new MessageBean();
		mBean.setMessage("Hi from Annotation Config");
		return mBean;
	}

}

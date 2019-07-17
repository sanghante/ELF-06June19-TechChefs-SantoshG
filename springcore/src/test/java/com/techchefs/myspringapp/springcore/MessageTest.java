package com.techchefs.myspringapp.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.myspringapp.springcore.beans.MessageBean;

import lombok.extern.java.Log;

@Log
public class MessageTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		MessageBean msg = (MessageBean) ctx.getBean("message");
		log.info(msg.getMessage());
		
		
	}
}

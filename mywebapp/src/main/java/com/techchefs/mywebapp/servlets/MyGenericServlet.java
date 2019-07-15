package com.techchefs.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/mygeneric")
public class MyGenericServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		
	}
	
	synchronized private void doget() {
		System.out.println("Hi from MyGeneric Servlet");
		
		{
			
		}
	}
	
	public MyGenericServlet() {
		//this(20);
		System.out.println("111");		
		{
			System.out.println("222");
		}
		System.out.println("333");
		
	}
	
	void mymethod() {
		System.out.println();
	}

	/*
	 * public MyGenericServlet(int i) { System.out.println("hi "+i); }
	 */
	
}

package com.techchefs.assessment;

import lombok.extern.java.Log;

/**
 * 27)	WAP to create the singleton class.
 * @author Santosh
 *
 */
@Log
public class SingletonImplementation {
	
	private static final SingletonImplementation object = new SingletonImplementation();
	
	private SingletonImplementation() {
		log.info("Single instance created as soon as class loaded");
	}
	
	public static SingletonImplementation getInstance() {
		return object;
	}
	
	public void doAction() {
		log.info("I am performing the task assigned");
	}

}

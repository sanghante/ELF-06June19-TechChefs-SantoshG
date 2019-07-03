package com.techchefs.jdbcapp.common;

import lombok.extern.java.Log;

@Log
public class ClassA implements Connection {

	@Override
	public void printMessage() {
		log.info("AAAAAAAA");
	}

}

package com.techchefs.javaapps.learning.filehandling;
import java.util.logging.Logger;


public class TestEmployeeBean3 {
	
	private static final  Logger logger = Logger.getLogger("MyApp");
	
	public static void main(String[] args) {
		
		EmployeeBean emp = new EmployeeBean();
		
		EmployeeBean3 emp3 = new EmployeeBean3();
		
		logger.info("Manually created bean");
		emp.setAge(23);
		logger.info(emp.toString());
		
		logger.info("Bean with Lombok");
		emp3.setAge(33);
		logger.info(emp3.toString());
	}

}

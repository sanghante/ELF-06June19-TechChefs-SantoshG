package com.techchefs.emp.dao;

public class EmployeeDAOFactoryold {

	private static String dbInteractionType = "hibernate";
	
	private EmployeeDAOFactoryold() {}

	public static EmployeeDAO getInstance(String dbInteractionType) {
		EmployeeDAO dao = null;
		if (dbInteractionType.equals("jdbc")) {
			//dao = new EmployeeDAOJDBCImpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl();
		}
		return dao;
	}// End of getInstance()

	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if (dbInteractionType.equals("jdbc")) {
			//dao = new EmployeeDAOJDBCImpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl();
		}
		return dao;
	}// End of getInstance()

}// End of Class

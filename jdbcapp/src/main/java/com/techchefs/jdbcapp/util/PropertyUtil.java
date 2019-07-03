package com.techchefs.jdbcapp.util;

import java.io.FileInputStream;
import java.util.Properties;

import com.techchefs.jdbcapp.exceptions.JDBCApplicationException;

import lombok.extern.java.Log;

@Log
public final class PropertyUtil {

	private static PropertyUtil propertyUtil = null;
	private Properties prop = null;
	
	private PropertyUtil() throws JDBCApplicationException {
		loadDBProperties();
	}
	
	private void loadDBProperties () throws JDBCApplicationException {
		try (FileInputStream fin = new FileInputStream("dbconnection.properties")) {

			prop = new Properties();
			prop.load(fin);
		} catch (Exception e) {
			log.severe("unable to load properties file for db connection");
			throw new JDBCApplicationException(e);
		}
	}
	
	public static PropertyUtil getPropertyUtil() throws JDBCApplicationException {
		if (propertyUtil == null)
			propertyUtil = new PropertyUtil();
		return propertyUtil;
	}
	
	public String getProperty(String key) {
		return prop.getProperty(key);
	}

}

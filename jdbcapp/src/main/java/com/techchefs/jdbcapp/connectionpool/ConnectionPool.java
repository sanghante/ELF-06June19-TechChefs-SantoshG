package com.techchefs.jdbcapp.connectionpool;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.techchefs.jdbcapp.exceptions.JDBCApplicationException;

import lombok.extern.java.Log;

@Log
public class ConnectionPool {

	private static ConnectionPool poolRef = null;
	private ArrayList<Connection> pool = new ArrayList<>();	
	private Properties prop = null;

	private void loadDBProperties () throws JDBCApplicationException {
		try (FileInputStream fin = new FileInputStream("dbconnection.properties")) {

			prop = new Properties();
			prop.load(fin);
		} catch (Exception e) {
			log.severe("unable to load properties file for db connection");
			throw new JDBCApplicationException(e);
		}
	}
	
	private void initializePool() throws JDBCApplicationException {

		String dbUrl = null;
		String user = null;
		String pwd = null;
		int poolSize;
		Connection con = null;
		try {
			
			poolSize = Integer.parseInt((prop.getProperty("poolSize")));
			dbUrl = prop.getProperty("dbUrl");
			user = prop.getProperty("user");
			pwd = prop.getProperty("pwd");
			
			for (int i = 0; i < poolSize; i++) {
				con = DriverManager.getConnection(dbUrl, user, pwd);
				pool.add(con);
			}

		} catch (SQLException sqle) {
			log.severe("Unable to create connection pool due to following exception : " + sqle.getMessage());
			throw new JDBCApplicationException(sqle);
		}
		
	}
	private ConnectionPool() throws JDBCApplicationException {
		loadDBProperties();
		initializePool();
	}

	public Connection getConnectionFromPool() {
		if (!pool.isEmpty()) {
			return pool.remove(0);
		} else {
			return null;
		}
	}

	public void returnConnectionToPool(Connection connection) {
		pool.add(connection);
	}

	public static ConnectionPool getConnectionPool() throws JDBCApplicationException {
		if (poolRef == null)
			poolRef = new ConnectionPool();

		return poolRef;
	}

}

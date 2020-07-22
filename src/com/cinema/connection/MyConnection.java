package com.cinema.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection{

	private static Connection connection = null;
	
	public static Connection getConnection() throws SQLException{		
		if ((ConnctionConstants.CONNECTION_URL != null)&&(ConnctionConstants.CONNCTION_USER_NAME != null)&&(ConnctionConstants.CONNCTION_USER_NAME != null)) {
			connection = DriverManager.getConnection(ConnctionConstants.CONNECTION_URL,	ConnctionConstants.CONNCTION_USER_NAME,	ConnctionConstants.CONNCTION_PASSWOR);
			System.out.println("Connection is ready");
		}
		return connection;
	}	
	
	public static void closeConnection() throws SQLException {
		if (connection != null) {
			System.out.println("Connction is Not Null");
			connection.close();
		}
	}
}

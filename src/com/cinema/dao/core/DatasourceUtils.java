package com.cinema.dao.core;

import java.sql.Connection;

import com.cinema.exception.JDBCConnectionException;

public abstract class DatasourceUtils {

	public static Connection getConnection(Datasource datasource) throws JDBCConnectionException{
		try {
			return datasource.getConnection();			
		}catch (Exception e) {
			throw new JDBCConnectionException("Database Connection Fail");
		}
	}
}

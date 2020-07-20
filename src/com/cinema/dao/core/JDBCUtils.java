package com.cinema.dao.core;

import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils {

	public static void closeStatement(Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

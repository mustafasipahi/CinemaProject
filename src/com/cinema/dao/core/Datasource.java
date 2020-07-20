package com.cinema.dao.core;

import java.sql.Connection;
import java.sql.SQLException;

public interface Datasource {

	Connection getConnection() throws SQLException;
	Connection getConnection(String userName,String password) throws SQLException;
}

package com.cinema.dao.core;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionTask<E> {

	E doInConnection(Connection connection) throws SQLException;
}

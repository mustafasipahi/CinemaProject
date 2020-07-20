package com.cinema.dao.core;

import java.sql.SQLException;
import java.sql.Statement;

public interface StatementTask<E> {

	public E doInStatement(Statement statement) throws SQLException;
}
